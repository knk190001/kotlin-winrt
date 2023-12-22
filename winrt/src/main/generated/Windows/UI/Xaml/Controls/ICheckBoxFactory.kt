package Windows.UI.Xaml.Controls

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

@ABIMarker(ICheckBoxFactory.ABI::class)
@Signature("{4fa6aabb-3f4b-4301-be07-1172ea61eefb}")
@Guid("4fa6aabb3f4b4301be071172ea61eefb")
@WinRTInterface("4fa6aabb3f4b4301be071172ea61eefb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICheckBoxFactory.ByReference::class)
public interface ICheckBoxFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): CheckBox?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICheckBoxFactory> {
    public override fun getValue() = ABI.makeICheckBoxFactory(pointer.getPointer(0))

    public fun setValue(value: ICheckBoxFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICheckBoxFactory {
    public val __1548894133_Ptr: Pointer?

    public val _1548894133_VtblPtr: Pointer?
      get() = __1548894133_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        CheckBox? {
      val fnPtr = _1548894133_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CheckBox>()
      val hr = fn.invokeHR(arrayOf(__1548894133_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CheckBox>(result.getValue())
      return resultValue
    }
  }

  public class ICheckBoxFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1548894133_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICheckBoxFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4fa6aabb3f4b4301be071172ea61eefb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICheckBoxFactory(ptr: Pointer?): WithDefault = ICheckBoxFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICheckBoxFactory {
      val address = segment.toRawLongValue()
      return makeICheckBoxFactory(Pointer(address))
    }

    public override fun toNative(obj: ICheckBoxFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1548894133_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICheckBoxFactory): Array<ICheckBoxFactory?> = (elements as
        Array<ICheckBoxFactory?>).castToImpl<ICheckBoxFactory,ICheckBoxFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICheckBoxFactory?> =
        arrayOfNulls<ICheckBoxFactory_Impl>(size) as Array<ICheckBoxFactory?>
  }
}
