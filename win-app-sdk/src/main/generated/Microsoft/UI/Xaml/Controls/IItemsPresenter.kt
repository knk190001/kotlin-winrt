package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DataTemplate
import Microsoft.UI.Xaml.Media.Animation.TransitionCollection
import Microsoft.UI.Xaml.Thickness
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

@ABIMarker(IItemsPresenter.ABI::class)
@Signature("{0b0fbb88-6cb3-5f4e-99bd-879916b460df}")
@Guid("0b0fbb886cb35f4e99bd879916b460df")
@WinRTInterface("0b0fbb886cb35f4e99bd879916b460df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IItemsPresenter.ByReference::class)
public interface IItemsPresenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Header(): IUnknown?

  @InterfaceMethod(1)
  public fun put_Header(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_HeaderTemplate(): DataTemplate?

  @InterfaceMethod(3)
  public fun put_HeaderTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(4)
  public fun get_HeaderTransitions(): TransitionCollection?

  @InterfaceMethod(5)
  public fun put_HeaderTransitions(value: TransitionCollection?): Unit

  @InterfaceMethod(6)
  public fun get_Footer(): IUnknown?

  @InterfaceMethod(7)
  public fun put_Footer(value: IUnknown?): Unit

  @InterfaceMethod(8)
  public fun get_FooterTemplate(): DataTemplate?

  @InterfaceMethod(9)
  public fun put_FooterTemplate(value: DataTemplate?): Unit

  @InterfaceMethod(10)
  public fun get_FooterTransitions(): TransitionCollection?

  @InterfaceMethod(11)
  public fun put_FooterTransitions(value: TransitionCollection?): Unit

  @InterfaceMethod(12)
  public fun get_Padding(): Thickness?

  @InterfaceMethod(13)
  public fun put_Padding(value: Thickness?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IItemsPresenter> {
    public override fun getValue() = ABI.makeIItemsPresenter(pointer.getPointer(0))

    public fun setValue(value: IItemsPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IItemsPresenter {
    public val __665521_Ptr: Pointer?

    public val _665521_VtblPtr: Pointer?
      get() = __665521_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Header(): IUnknown? {
      val fnPtr = _665521_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__665521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Header(value: IUnknown?): Unit {
      val fnPtr = _665521_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__665521_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_HeaderTemplate(): DataTemplate? {
      val fnPtr = _665521_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__665521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_HeaderTemplate(value: DataTemplate?): Unit {
      val fnPtr = _665521_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__665521_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_HeaderTransitions(): TransitionCollection? {
      val fnPtr = _665521_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__665521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_HeaderTransitions(value: TransitionCollection?): Unit {
      val fnPtr = _665521_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__665521_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Footer(): IUnknown? {
      val fnPtr = _665521_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__665521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Footer(value: IUnknown?): Unit {
      val fnPtr = _665521_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__665521_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FooterTemplate(): DataTemplate? {
      val fnPtr = _665521_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataTemplate>()
      val hr = fn.invokeHR(arrayOf(__665521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataTemplate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_FooterTemplate(value: DataTemplate?): Unit {
      val fnPtr = _665521_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__665521_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_FooterTransitions(): TransitionCollection? {
      val fnPtr = _665521_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__665521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_FooterTransitions(value: TransitionCollection?): Unit {
      val fnPtr = _665521_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__665521_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_Padding(): Thickness? {
      val fnPtr = _665521_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__665521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_Padding(value: Thickness?): Unit {
      val fnPtr = _665521_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__665521_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IItemsPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __665521_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IItemsPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0b0fbb886cb35f4e99bd879916b460df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIItemsPresenter(ptr: Pointer?): WithDefault = IItemsPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IItemsPresenter {
      val address = segment.toRawLongValue()
      return makeIItemsPresenter(Pointer(address))
    }

    public override fun toNative(obj: IItemsPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__665521_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IItemsPresenter): Array<IItemsPresenter?> = (elements as
        Array<IItemsPresenter?>).castToImpl<IItemsPresenter,IItemsPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IItemsPresenter?> =
        arrayOfNulls<IItemsPresenter_Impl>(size) as Array<IItemsPresenter?>
  }
}
