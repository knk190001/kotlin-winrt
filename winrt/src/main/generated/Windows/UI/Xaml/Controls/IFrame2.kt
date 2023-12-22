package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IVector
import Windows.UI.Xaml.Interop.TypeName
import Windows.UI.Xaml.Media.Animation.NavigationTransitionInfo
import Windows.UI.Xaml.Navigation.PageStackEntry
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFrame2.ABI::class)
@Signature("{3f367f87-9f5a-4b04-b818-b554c069597a}")
@Guid("3f367f879f5a4b04b818b554c069597a")
@WinRTInterface("3f367f879f5a4b04b818b554c069597a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrame2.ByReference::class)
public interface IFrame2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BackStack(): IVector<PageStackEntry?>?

  @InterfaceMethod(1)
  public fun get_ForwardStack(): IVector<PageStackEntry?>?

  @InterfaceMethod(2)
  public fun Navigate(
    sourcePageType: TypeName?,
    parameter: IUnknown?,
    infoOverride: NavigationTransitionInfo?
  ): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFrame2> {
    public override fun getValue() = ABI.makeIFrame2(pointer.getPointer(0))

    public fun setValue(value: IFrame2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrame2 {
    public val __368728961_Ptr: Pointer?

    public val _368728961_VtblPtr: Pointer?
      get() = __368728961_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BackStack(): IVector<PageStackEntry?>? {
      val fnPtr = _368728961_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<PageStackEntry?>>()
      val hr = fn.invokeHR(arrayOf(__368728961_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<PageStackEntry?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ForwardStack(): IVector<PageStackEntry?>? {
      val fnPtr = _368728961_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<PageStackEntry?>>()
      val hr = fn.invokeHR(arrayOf(__368728961_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<PageStackEntry?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Navigate(
      sourcePageType: TypeName?,
      parameter: IUnknown?,
      infoOverride: NavigationTransitionInfo?
    ): Boolean {
      val fnPtr = _368728961_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__368728961_Ptr, marshalToNative(sourcePageType),
          marshalToNative(parameter), marshalToNative(infoOverride), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IFrame2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __368728961_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrame2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3f367f879f5a4b04b818b554c069597a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrame2(ptr: Pointer?): WithDefault = IFrame2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrame2 {
      val address = segment.toRawLongValue()
      return makeIFrame2(Pointer(address))
    }

    public override fun toNative(obj: IFrame2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__368728961_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrame2): Array<IFrame2?> = (elements as
        Array<IFrame2?>).castToImpl<IFrame2,IFrame2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrame2?> = arrayOfNulls<IFrame2_Impl>(size) as
        Array<IFrame2?>
  }
}
