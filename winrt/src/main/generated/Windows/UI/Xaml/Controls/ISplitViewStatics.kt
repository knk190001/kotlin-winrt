package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(ISplitViewStatics.ABI::class)
@Signature("{859b4f6f-44ab-4e4b-91c1-17b7056d9b5f}")
@Guid("859b4f6f44ab4e4b91c117b7056d9b5f")
@WinRTInterface("859b4f6f44ab4e4b91c117b7056d9b5f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitViewStatics.ByReference::class)
public interface ISplitViewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_PaneProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsPaneOpenProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_OpenPaneLengthProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_CompactPaneLengthProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_PanePlacementProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_DisplayModeProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_TemplateSettingsProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_PaneBackgroundProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplitViewStatics> {
    public override fun getValue() = ABI.makeISplitViewStatics(pointer.getPointer(0))

    public fun setValue(value: ISplitViewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitViewStatics {
    public val __1007606270_Ptr: Pointer?

    public val _1007606270_VtblPtr: Pointer?
      get() = __1007606270_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentProperty(): DependencyProperty? {
      val fnPtr = _1007606270_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1007606270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PaneProperty(): DependencyProperty? {
      val fnPtr = _1007606270_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1007606270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsPaneOpenProperty(): DependencyProperty? {
      val fnPtr = _1007606270_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1007606270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_OpenPaneLengthProperty(): DependencyProperty? {
      val fnPtr = _1007606270_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1007606270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CompactPaneLengthProperty(): DependencyProperty? {
      val fnPtr = _1007606270_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1007606270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PanePlacementProperty(): DependencyProperty? {
      val fnPtr = _1007606270_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1007606270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_DisplayModeProperty(): DependencyProperty? {
      val fnPtr = _1007606270_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1007606270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_TemplateSettingsProperty(): DependencyProperty? {
      val fnPtr = _1007606270_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1007606270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_PaneBackgroundProperty(): DependencyProperty? {
      val fnPtr = _1007606270_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1007606270_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISplitViewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1007606270_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitViewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("859b4f6f44ab4e4b91c117b7056d9b5f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitViewStatics(ptr: Pointer?): WithDefault = ISplitViewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitViewStatics {
      val address = segment.toRawLongValue()
      return makeISplitViewStatics(Pointer(address))
    }

    public override fun toNative(obj: ISplitViewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1007606270_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitViewStatics): Array<ISplitViewStatics?> = (elements
        as Array<ISplitViewStatics?>).castToImpl<ISplitViewStatics,ISplitViewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitViewStatics?> =
        arrayOfNulls<ISplitViewStatics_Impl>(size) as Array<ISplitViewStatics?>
  }
}
