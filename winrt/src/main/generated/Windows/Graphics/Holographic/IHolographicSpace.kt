package Windows.Graphics.Holographic

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Graphics.DirectX.Direct3D11.IDirect3DDevice
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

@ABIMarker(IHolographicSpace.ABI::class)
@Signature("{4380dba6-5e78-434f-807c-3433d1efe8b7}")
@Guid("4380dba65e78434f807c3433d1efe8b7")
@WinRTInterface("4380dba65e78434f807c3433d1efe8b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicSpace.ByReference::class)
public interface IHolographicSpace : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrimaryAdapterId(): HolographicAdapterId?

  @InterfaceMethod(1)
  public fun SetDirect3D11Device(value: IDirect3DDevice?): Unit

  @InterfaceMethod(2)
  public fun add_CameraAdded(handler: TypedEventHandler<HolographicSpace?,
      HolographicSpaceCameraAddedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_CameraAdded(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_CameraRemoved(handler: TypedEventHandler<HolographicSpace?,
      HolographicSpaceCameraRemovedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_CameraRemoved(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun CreateNextFrame(): HolographicFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicSpace> {
    public override fun getValue() = ABI.makeIHolographicSpace(pointer.getPointer(0))

    public fun setValue(value: IHolographicSpace_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicSpace {
    public val __1939254603_Ptr: Pointer?

    public val _1939254603_VtblPtr: Pointer?
      get() = __1939254603_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrimaryAdapterId(): HolographicAdapterId? {
      val fnPtr = _1939254603_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicAdapterId>()
      val hr = fn.invokeHR(arrayOf(__1939254603_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicAdapterId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetDirect3D11Device(value: IDirect3DDevice?): Unit {
      val fnPtr = _1939254603_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939254603_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_CameraAdded(handler: TypedEventHandler<HolographicSpace?,
        HolographicSpaceCameraAddedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1939254603_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1939254603_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_CameraAdded(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1939254603_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939254603_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_CameraRemoved(handler: TypedEventHandler<HolographicSpace?,
        HolographicSpaceCameraRemovedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1939254603_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1939254603_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_CameraRemoved(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1939254603_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1939254603_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun CreateNextFrame(): HolographicFrame? {
      val fnPtr = _1939254603_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicFrame>()
      val hr = fn.invokeHR(arrayOf(__1939254603_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicFrame>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicSpace_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1939254603_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicSpace, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4380dba65e78434f807c3433d1efe8b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicSpace(ptr: Pointer?): WithDefault = IHolographicSpace_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicSpace {
      val address = segment.toRawLongValue()
      return makeIHolographicSpace(Pointer(address))
    }

    public override fun toNative(obj: IHolographicSpace): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1939254603_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicSpace): Array<IHolographicSpace?> = (elements
        as Array<IHolographicSpace?>).castToImpl<IHolographicSpace,IHolographicSpace_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicSpace?> =
        arrayOfNulls<IHolographicSpace_Impl>(size) as Array<IHolographicSpace?>
  }
}
