package Windows.Devices.Display.Core

import Windows.Foundation.Collections.IMap
import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IDisplayState.ABI::class)
@Signature("{08129321-11b5-5cb2-99f8-e90b479a8a1d}")
@Guid("0812932111b55cb299f8e90b479a8a1d")
@WinRTInterface("0812932111b55cb299f8e90b479a8a1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayState.ByReference::class)
public interface IDisplayState : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsReadOnly(): Boolean

  @InterfaceMethod(1)
  public fun get_IsStale(): Boolean

  @InterfaceMethod(2)
  public fun get_Targets(): IVectorView<DisplayTarget?>?

  @InterfaceMethod(3)
  public fun get_Views(): IVectorView<DisplayView?>?

  @InterfaceMethod(4)
  public fun get_Properties(): IMap<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>?

  @InterfaceMethod(5)
  public fun ConnectTarget(target: DisplayTarget?): DisplayPath?

  @InterfaceMethod(6)
  public fun ConnectTarget(target: DisplayTarget?, view: DisplayView?): DisplayPath?

  @InterfaceMethod(7)
  public fun CanConnectTargetToView(target: DisplayTarget?, view: DisplayView?): Boolean

  @InterfaceMethod(8)
  public fun GetViewForTarget(target: DisplayTarget?): DisplayView?

  @InterfaceMethod(9)
  public fun GetPathForTarget(target: DisplayTarget?): DisplayPath?

  @InterfaceMethod(10)
  public fun DisconnectTarget(target: DisplayTarget?): Unit

  @InterfaceMethod(11)
  public fun TryFunctionalize(options: DisplayStateFunctionalizeOptions?):
      DisplayStateOperationResult?

  @InterfaceMethod(12)
  public fun TryApply(options: DisplayStateApplyOptions?): DisplayStateOperationResult?

  @InterfaceMethod(13)
  public fun Clone(): DisplayState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDisplayState>
      {
    public override fun getValue() = ABI.makeIDisplayState(pointer.getPointer(0))

    public fun setValue(value: IDisplayState_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayState {
    public val __2039079567_Ptr: Pointer?

    public val _2039079567_VtblPtr: Pointer?
      get() = __2039079567_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsReadOnly(): Boolean {
      val fnPtr = _2039079567_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2039079567_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsStale(): Boolean {
      val fnPtr = _2039079567_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2039079567_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Targets(): IVectorView<DisplayTarget?>? {
      val fnPtr = _2039079567_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DisplayTarget?>>()
      val hr = fn.invokeHR(arrayOf(__2039079567_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DisplayTarget?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Views(): IVectorView<DisplayView?>? {
      val fnPtr = _2039079567_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<DisplayView?>>()
      val hr = fn.invokeHR(arrayOf(__2039079567_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<DisplayView?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Properties(): IMap<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>? {
      val fnPtr = _2039079567_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<com.sun.jna.platform.win32.Guid.GUID?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__2039079567_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<com.sun.jna.platform.win32.Guid.GUID?,
          IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun ConnectTarget(target: DisplayTarget?): DisplayPath? {
      val fnPtr = _2039079567_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayPath>()
      val hr = fn.invokeHR(arrayOf(__2039079567_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayPath>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun ConnectTarget(target: DisplayTarget?, view: DisplayView?): DisplayPath? {
      val fnPtr = _2039079567_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayPath>()
      val hr = fn.invokeHR(arrayOf(__2039079567_Ptr, marshalToNative(target), marshalToNative(view),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayPath>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CanConnectTargetToView(target: DisplayTarget?, view: DisplayView?):
        Boolean {
      val fnPtr = _2039079567_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2039079567_Ptr, marshalToNative(target), marshalToNative(view),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun GetViewForTarget(target: DisplayTarget?): DisplayView? {
      val fnPtr = _2039079567_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayView>()
      val hr = fn.invokeHR(arrayOf(__2039079567_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetPathForTarget(target: DisplayTarget?): DisplayPath? {
      val fnPtr = _2039079567_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayPath>()
      val hr = fn.invokeHR(arrayOf(__2039079567_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayPath>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun DisconnectTarget(target: DisplayTarget?): Unit {
      val fnPtr = _2039079567_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2039079567_Ptr, marshalToNative(target),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun TryFunctionalize(options: DisplayStateFunctionalizeOptions?):
        DisplayStateOperationResult? {
      val fnPtr = _2039079567_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayStateOperationResult>()
      val hr = fn.invokeHR(arrayOf(__2039079567_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayStateOperationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun TryApply(options: DisplayStateApplyOptions?): DisplayStateOperationResult? {
      val fnPtr = _2039079567_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayStateOperationResult>()
      val hr = fn.invokeHR(arrayOf(__2039079567_Ptr, marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayStateOperationResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun Clone(): DisplayState? {
      val fnPtr = _2039079567_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayState>()
      val hr = fn.invokeHR(arrayOf(__2039079567_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayState>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayState_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2039079567_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayState, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0812932111b55cb299f8e90b479a8a1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayState(ptr: Pointer?): WithDefault = IDisplayState_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayState {
      val address = segment.toRawLongValue()
      return makeIDisplayState(Pointer(address))
    }

    public override fun toNative(obj: IDisplayState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2039079567_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayState): Array<IDisplayState?> = (elements as
        Array<IDisplayState?>).castToImpl<IDisplayState,IDisplayState_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayState?> =
        arrayOfNulls<IDisplayState_Impl>(size) as Array<IDisplayState?>
  }
}
