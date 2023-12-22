package Microsoft.UI.Xaml

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDependencyObjectFactory.ABI::class)
@Signature("{936b614c-475f-5d7d-b3f7-bf1fbea28126}")
@Guid("936b614c475f5d7db3f7bf1fbea28126")
@WinRTInterface("936b614c475f5d7db3f7bf1fbea28126")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDependencyObjectFactory.ByReference::class)
public interface IDependencyObjectFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): DependencyObject?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDependencyObjectFactory> {
    public override fun getValue() = ABI.makeIDependencyObjectFactory(pointer.getPointer(0))

    public fun setValue(value: IDependencyObjectFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDependencyObjectFactory {
    public val __139589863_Ptr: Pointer?

    public val _139589863_VtblPtr: Pointer?
      get() = __139589863_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        DependencyObject? {
      val fnPtr = _139589863_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__139589863_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }
  }

  public class IDependencyObjectFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __139589863_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDependencyObjectFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("936b614c475f5d7db3f7bf1fbea28126")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDependencyObjectFactory(ptr: Pointer?): WithDefault =
        IDependencyObjectFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDependencyObjectFactory {
      val address = segment.toRawLongValue()
      return makeIDependencyObjectFactory(Pointer(address))
    }

    public override fun toNative(obj: IDependencyObjectFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__139589863_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDependencyObjectFactory):
        Array<IDependencyObjectFactory?> = (elements as
        Array<IDependencyObjectFactory?>).castToImpl<IDependencyObjectFactory,IDependencyObjectFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDependencyObjectFactory?> =
        arrayOfNulls<IDependencyObjectFactory_Impl>(size) as Array<IDependencyObjectFactory?>
  }
}
