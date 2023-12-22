package Windows.Services.TargetedContent

import Windows.Foundation.Collections.IMapView
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITargetedContentItem.ABI::class)
@Signature("{38168dc4-276c-4c32-96ba-565c6e406e74}")
@Guid("38168dc4276c4c3296ba565c6e406e74")
@WinRTInterface("38168dc4276c4c3296ba565c6e406e74")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITargetedContentItem.ByReference::class)
public interface ITargetedContentItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Path(): String?

  @InterfaceMethod(1)
  public fun ReportInteraction(interaction: TargetedContentInteraction?): Unit

  @InterfaceMethod(2)
  public fun ReportCustomInteraction(customInteractionName: String?): Unit

  @InterfaceMethod(3)
  public fun get_State(): TargetedContentItemState?

  @InterfaceMethod(4)
  public fun get_Properties(): IMapView<String?, TargetedContentValue?>?

  @InterfaceMethod(5)
  public fun get_Collections(): IVectorView<TargetedContentCollection?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITargetedContentItem> {
    public override fun getValue() = ABI.makeITargetedContentItem(pointer.getPointer(0))

    public fun setValue(value: ITargetedContentItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITargetedContentItem {
    public val __772760087_Ptr: Pointer?

    public val _772760087_VtblPtr: Pointer?
      get() = __772760087_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Path(): String? {
      val fnPtr = _772760087_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__772760087_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ReportInteraction(interaction: TargetedContentInteraction?): Unit {
      val fnPtr = _772760087_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__772760087_Ptr, marshalToNative(interaction),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun ReportCustomInteraction(customInteractionName: String?): Unit {
      val fnPtr = _772760087_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__772760087_Ptr, marshalToNative(customInteractionName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_State(): TargetedContentItemState? {
      val fnPtr = _772760087_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TargetedContentItemState>()
      val hr = fn.invokeHR(arrayOf(__772760087_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TargetedContentItemState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Properties(): IMapView<String?, TargetedContentValue?>? {
      val fnPtr = _772760087_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, TargetedContentValue?>>()
      val hr = fn.invokeHR(arrayOf(__772760087_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?,
          TargetedContentValue?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Collections(): IVectorView<TargetedContentCollection?>? {
      val fnPtr = _772760087_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<TargetedContentCollection?>>()
      val hr = fn.invokeHR(arrayOf(__772760087_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<TargetedContentCollection?>>(result.getValue())
      return resultValue
    }
  }

  public class ITargetedContentItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __772760087_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITargetedContentItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38168dc4276c4c3296ba565c6e406e74")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITargetedContentItem(ptr: Pointer?): WithDefault = ITargetedContentItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITargetedContentItem {
      val address = segment.toRawLongValue()
      return makeITargetedContentItem(Pointer(address))
    }

    public override fun toNative(obj: ITargetedContentItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__772760087_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITargetedContentItem): Array<ITargetedContentItem?> =
        (elements as
        Array<ITargetedContentItem?>).castToImpl<ITargetedContentItem,ITargetedContentItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITargetedContentItem?> =
        arrayOfNulls<ITargetedContentItem_Impl>(size) as Array<ITargetedContentItem?>
  }
}
