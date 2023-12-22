package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Thickness
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

@ABIMarker(IInfoBarPanel.ABI::class)
@Signature("{4d2fd5fe-cb75-52ff-b57f-a992912383cc}")
@Guid("4d2fd5fecb7552ffb57fa992912383cc")
@WinRTInterface("4d2fd5fecb7552ffb57fa992912383cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInfoBarPanel.ByReference::class)
public interface IInfoBarPanel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalOrientationPadding(): Thickness?

  @InterfaceMethod(1)
  public fun put_HorizontalOrientationPadding(value: Thickness?): Unit

  @InterfaceMethod(2)
  public fun get_VerticalOrientationPadding(): Thickness?

  @InterfaceMethod(3)
  public fun put_VerticalOrientationPadding(value: Thickness?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInfoBarPanel>
      {
    public override fun getValue() = ABI.makeIInfoBarPanel(pointer.getPointer(0))

    public fun setValue(value: IInfoBarPanel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInfoBarPanel {
    public val __803908432_Ptr: Pointer?

    public val _803908432_VtblPtr: Pointer?
      get() = __803908432_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalOrientationPadding(): Thickness? {
      val fnPtr = _803908432_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__803908432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_HorizontalOrientationPadding(value: Thickness?): Unit {
      val fnPtr = _803908432_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__803908432_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_VerticalOrientationPadding(): Thickness? {
      val fnPtr = _803908432_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__803908432_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_VerticalOrientationPadding(value: Thickness?): Unit {
      val fnPtr = _803908432_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__803908432_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInfoBarPanel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __803908432_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInfoBarPanel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d2fd5fecb7552ffb57fa992912383cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInfoBarPanel(ptr: Pointer?): WithDefault = IInfoBarPanel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInfoBarPanel {
      val address = segment.toRawLongValue()
      return makeIInfoBarPanel(Pointer(address))
    }

    public override fun toNative(obj: IInfoBarPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__803908432_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInfoBarPanel): Array<IInfoBarPanel?> = (elements as
        Array<IInfoBarPanel?>).castToImpl<IInfoBarPanel,IInfoBarPanel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInfoBarPanel?> =
        arrayOfNulls<IInfoBarPanel_Impl>(size) as Array<IInfoBarPanel?>
  }
}
