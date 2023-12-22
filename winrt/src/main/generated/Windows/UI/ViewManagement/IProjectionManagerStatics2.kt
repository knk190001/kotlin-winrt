package Windows.UI.ViewManagement

import Windows.Devices.Enumeration.DeviceInformation
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Rect
import Windows.UI.Popups.Placement
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProjectionManagerStatics2.ABI::class)
@Signature("{f33d2f43-2749-4cde-b977-c0c41e7415d1}")
@Guid("f33d2f4327494cdeb977c0c41e7415d1")
@WinRTInterface("f33d2f4327494cdeb977c0c41e7415d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProjectionManagerStatics2.ByReference::class)
public interface IProjectionManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun StartProjectingAsync(
    projectionViewId: Int,
    anchorViewId: Int,
    displayDeviceInfo: DeviceInformation?
  ): IAsyncAction?

  @InterfaceMethod(1)
  public fun RequestStartProjectingAsync(
    projectionViewId: Int,
    anchorViewId: Int,
    selection: Rect?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun RequestStartProjectingAsync(
    projectionViewId: Int,
    anchorViewId: Int,
    selection: Rect?,
    prefferedPlacement: Placement?
  ): IAsyncOperation<Boolean>?

  @InterfaceMethod(3)
  public fun GetDeviceSelector(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProjectionManagerStatics2> {
    public override fun getValue() = ABI.makeIProjectionManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IProjectionManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProjectionManagerStatics2 {
    public val __1633161415_Ptr: Pointer?

    public val _1633161415_VtblPtr: Pointer?
      get() = __1633161415_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun StartProjectingAsync(
      projectionViewId: Int,
      anchorViewId: Int,
      displayDeviceInfo: DeviceInformation?
    ): IAsyncAction? {
      val fnPtr = _1633161415_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1633161415_Ptr, projectionViewId, anchorViewId,
          marshalToNative(displayDeviceInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestStartProjectingAsync(
      projectionViewId: Int,
      anchorViewId: Int,
      selection: Rect?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _1633161415_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1633161415_Ptr, projectionViewId, anchorViewId,
          marshalToNative(selection), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RequestStartProjectingAsync(
      projectionViewId: Int,
      anchorViewId: Int,
      selection: Rect?,
      prefferedPlacement: Placement?
    ): IAsyncOperation<Boolean>? {
      val fnPtr = _1633161415_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1633161415_Ptr, projectionViewId, anchorViewId,
          marshalToNative(selection), marshalToNative(prefferedPlacement), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1633161415_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1633161415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IProjectionManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1633161415_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProjectionManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f33d2f4327494cdeb977c0c41e7415d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProjectionManagerStatics2(ptr: Pointer?): WithDefault =
        IProjectionManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProjectionManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIProjectionManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IProjectionManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1633161415_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProjectionManagerStatics2):
        Array<IProjectionManagerStatics2?> = (elements as
        Array<IProjectionManagerStatics2?>).castToImpl<IProjectionManagerStatics2,IProjectionManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProjectionManagerStatics2?> =
        arrayOfNulls<IProjectionManagerStatics2_Impl>(size) as Array<IProjectionManagerStatics2?>
  }
}
