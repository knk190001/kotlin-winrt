package Microsoft.UI.Xaml

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

@ABIMarker(ITargetPropertyPathFactory.ABI::class)
@Signature("{894cb11d-5c16-555b-b661-f41b29fd9b21}")
@Guid("894cb11d5c16555bb661f41b29fd9b21")
@WinRTInterface("894cb11d5c16555bb661f41b29fd9b21")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetPropertyPathFactory.ByReference::class)
public interface ITargetPropertyPathFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(targetProperty: DependencyProperty?): TargetPropertyPath?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetPropertyPathFactory> {
    public override fun getValue() = ABI.makeITargetPropertyPathFactory(pointer.getPointer(0))

    public fun setValue(value: ITargetPropertyPathFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetPropertyPathFactory {
    public val __1104470952_Ptr: Pointer?

    public val _1104470952_VtblPtr: Pointer?
      get() = __1104470952_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(targetProperty: DependencyProperty?): TargetPropertyPath? {
      val fnPtr = _1104470952_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetPropertyPath>()
      val hr = fn.invokeHR(arrayOf(__1104470952_Ptr, marshalToNative(targetProperty), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetPropertyPath>(result.getValue())
      return resultValue
    }
  }

  public class ITargetPropertyPathFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1104470952_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetPropertyPathFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("894cb11d5c16555bb661f41b29fd9b21")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetPropertyPathFactory(ptr: Pointer?): WithDefault =
        ITargetPropertyPathFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetPropertyPathFactory {
      val address = segment.toRawLongValue()
      return makeITargetPropertyPathFactory(Pointer(address))
    }

    public override fun toNative(obj: ITargetPropertyPathFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1104470952_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetPropertyPathFactory):
        Array<ITargetPropertyPathFactory?> = (elements as
        Array<ITargetPropertyPathFactory?>).castToImpl<ITargetPropertyPathFactory,ITargetPropertyPathFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetPropertyPathFactory?> =
        arrayOfNulls<ITargetPropertyPathFactory_Impl>(size) as Array<ITargetPropertyPathFactory?>
  }
}
