package Microsoft.UI.Xaml.Controls

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INavigationViewTemplateSettings2.ABI::class)
@Signature("{56bec72f-1de1-5060-a44c-187885df2973}")
@Guid("56bec72f1de15060a44c187885df2973")
@WinRTInterface("56bec72f1de15060a44c187885df2973")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewTemplateSettings2.ByReference::class)
public interface INavigationViewTemplateSettings2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OpenPaneLength(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewTemplateSettings2> {
    public override fun getValue() = ABI.makeINavigationViewTemplateSettings2(pointer.getPointer(0))

    public fun setValue(value: INavigationViewTemplateSettings2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewTemplateSettings2 {
    public val __872883051_Ptr: Pointer?

    public val _872883051_VtblPtr: Pointer?
      get() = __872883051_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OpenPaneLength(): Double {
      val fnPtr = _872883051_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__872883051_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class INavigationViewTemplateSettings2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __872883051_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewTemplateSettings2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("56bec72f1de15060a44c187885df2973")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewTemplateSettings2(ptr: Pointer?): WithDefault =
        INavigationViewTemplateSettings2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewTemplateSettings2 {
      val address = segment.toRawLongValue()
      return makeINavigationViewTemplateSettings2(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewTemplateSettings2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__872883051_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewTemplateSettings2):
        Array<INavigationViewTemplateSettings2?> = (elements as
        Array<INavigationViewTemplateSettings2?>).castToImpl<INavigationViewTemplateSettings2,INavigationViewTemplateSettings2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewTemplateSettings2?> =
        arrayOfNulls<INavigationViewTemplateSettings2_Impl>(size) as
        Array<INavigationViewTemplateSettings2?>
  }
}
