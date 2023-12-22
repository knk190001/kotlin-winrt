package Windows.UI.WindowManagement

import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IWindowingEnvironmentStatics.ABI::class)
@Signature("{874e9fb7-c642-55ab-8aa2-162f734a9a72}")
@Guid("874e9fb7c64255ab8aa2162f734a9a72")
@WinRTInterface("874e9fb7c64255ab8aa2162f734a9a72")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowingEnvironmentStatics.ByReference::class)
public interface IWindowingEnvironmentStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindAll(): IVectorView<WindowingEnvironment?>?

  @InterfaceMethod(1)
  public fun FindAll(kind: WindowingEnvironmentKind?): IVectorView<WindowingEnvironment?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowingEnvironmentStatics> {
    public override fun getValue() = ABI.makeIWindowingEnvironmentStatics(pointer.getPointer(0))

    public fun setValue(value: IWindowingEnvironmentStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowingEnvironmentStatics {
    public val __474950461_Ptr: Pointer?

    public val _474950461_VtblPtr: Pointer?
      get() = __474950461_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindAll(): IVectorView<WindowingEnvironment?>? {
      val fnPtr = _474950461_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WindowingEnvironment?>>()
      val hr = fn.invokeHR(arrayOf(__474950461_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WindowingEnvironment?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindAll(kind: WindowingEnvironmentKind?):
        IVectorView<WindowingEnvironment?>? {
      val fnPtr = _474950461_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WindowingEnvironment?>>()
      val hr = fn.invokeHR(arrayOf(__474950461_Ptr, marshalToNative(kind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WindowingEnvironment?>>(result.getValue())
      return resultValue
    }
  }

  public class IWindowingEnvironmentStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __474950461_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowingEnvironmentStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("874e9fb7c64255ab8aa2162f734a9a72")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowingEnvironmentStatics(ptr: Pointer?): WithDefault =
        IWindowingEnvironmentStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowingEnvironmentStatics {
      val address = segment.toRawLongValue()
      return makeIWindowingEnvironmentStatics(Pointer(address))
    }

    public override fun toNative(obj: IWindowingEnvironmentStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__474950461_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowingEnvironmentStatics):
        Array<IWindowingEnvironmentStatics?> = (elements as
        Array<IWindowingEnvironmentStatics?>).castToImpl<IWindowingEnvironmentStatics,IWindowingEnvironmentStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowingEnvironmentStatics?> =
        arrayOfNulls<IWindowingEnvironmentStatics_Impl>(size) as
        Array<IWindowingEnvironmentStatics?>
  }
}
