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

@ABIMarker(IUserControlFactory.ABI::class)
@Signature("{38b1ed92-a28a-4972-93df-f4f759b8afd2}")
@Guid("38b1ed92a28a497293dff4f759b8afd2")
@WinRTInterface("38b1ed92a28a497293dff4f759b8afd2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserControlFactory.ByReference::class)
public interface IUserControlFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): UserControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserControlFactory> {
    public override fun getValue() = ABI.makeIUserControlFactory(pointer.getPointer(0))

    public fun setValue(value: IUserControlFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserControlFactory {
    public val __1918097076_Ptr: Pointer?

    public val _1918097076_VtblPtr: Pointer?
      get() = __1918097076_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        UserControl? {
      val fnPtr = _1918097076_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserControl>()
      val hr = fn.invokeHR(arrayOf(__1918097076_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserControl>(result.getValue())
      return resultValue
    }
  }

  public class IUserControlFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1918097076_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserControlFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38b1ed92a28a497293dff4f759b8afd2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserControlFactory(ptr: Pointer?): WithDefault = IUserControlFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserControlFactory {
      val address = segment.toRawLongValue()
      return makeIUserControlFactory(Pointer(address))
    }

    public override fun toNative(obj: IUserControlFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1918097076_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserControlFactory): Array<IUserControlFactory?> =
        (elements as
        Array<IUserControlFactory?>).castToImpl<IUserControlFactory,IUserControlFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserControlFactory?> =
        arrayOfNulls<IUserControlFactory_Impl>(size) as Array<IUserControlFactory?>
  }
}
