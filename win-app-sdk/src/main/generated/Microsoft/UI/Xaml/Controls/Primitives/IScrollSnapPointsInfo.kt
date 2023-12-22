package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Orientation
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollSnapPointsInfo.ABI::class)
@Signature("{d3ea6e09-ecf7-51a8-bd54-fc84b9653766}")
@Guid("d3ea6e09ecf751a8bd54fc84b9653766")
@WinRTInterface("d3ea6e09ecf751a8bd54fc84b9653766")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollSnapPointsInfo.ByReference::class)
public interface IScrollSnapPointsInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AreHorizontalSnapPointsRegular(): Boolean

  @InterfaceMethod(1)
  public fun get_AreVerticalSnapPointsRegular(): Boolean

  @InterfaceMethod(2)
  public fun add_HorizontalSnapPointsChanged(handler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_HorizontalSnapPointsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_VerticalSnapPointsChanged(handler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_VerticalSnapPointsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun GetIrregularSnapPoints(orientation: Orientation?, alignment: SnapPointsAlignment?):
      IVectorView<Float>?

  @InterfaceMethod(7)
  public fun GetRegularSnapPoints(
    orientation: Orientation?,
    alignment: SnapPointsAlignment?,
    offset: Float
  ): Float

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollSnapPointsInfo> {
    public override fun getValue() = ABI.makeIScrollSnapPointsInfo(pointer.getPointer(0))

    public fun setValue(value: IScrollSnapPointsInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollSnapPointsInfo {
    public val __1788393063_Ptr: Pointer?

    public val _1788393063_VtblPtr: Pointer?
      get() = __1788393063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AreHorizontalSnapPointsRegular(): Boolean {
      val fnPtr = _1788393063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1788393063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_AreVerticalSnapPointsRegular(): Boolean {
      val fnPtr = _1788393063_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1788393063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun add_HorizontalSnapPointsChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1788393063_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1788393063_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_HorizontalSnapPointsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1788393063_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788393063_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_VerticalSnapPointsChanged(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1788393063_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1788393063_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_VerticalSnapPointsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1788393063_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1788393063_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun GetIrregularSnapPoints(orientation: Orientation?,
        alignment: SnapPointsAlignment?): IVectorView<Float>? {
      val fnPtr = _1788393063_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Float>>()
      val hr = fn.invokeHR(arrayOf(__1788393063_Ptr, marshalToNative(orientation),
          marshalToNative(alignment), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Float>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetRegularSnapPoints(
      orientation: Orientation?,
      alignment: SnapPointsAlignment?,
      offset: Float
    ): Float {
      val fnPtr = _1788393063_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1788393063_Ptr, marshalToNative(orientation),
          marshalToNative(alignment), offset, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }
  }

  public class IScrollSnapPointsInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1788393063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollSnapPointsInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d3ea6e09ecf751a8bd54fc84b9653766")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollSnapPointsInfo(ptr: Pointer?): WithDefault =
        IScrollSnapPointsInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollSnapPointsInfo {
      val address = segment.toRawLongValue()
      return makeIScrollSnapPointsInfo(Pointer(address))
    }

    public override fun toNative(obj: IScrollSnapPointsInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1788393063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollSnapPointsInfo): Array<IScrollSnapPointsInfo?> =
        (elements as
        Array<IScrollSnapPointsInfo?>).castToImpl<IScrollSnapPointsInfo,IScrollSnapPointsInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollSnapPointsInfo?> =
        arrayOfNulls<IScrollSnapPointsInfo_Impl>(size) as Array<IScrollSnapPointsInfo?>
  }
}
