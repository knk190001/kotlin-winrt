package Windows.Gaming.Input

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

@ABIMarker(IRawGameControllerStatics.ABI::class)
@Signature("{eb8d0792-e95a-4b19-afc7-0a59f8bf759e}")
@Guid("eb8d0792e95a4b19afc70a59f8bf759e")
@WinRTInterface("eb8d0792e95a4b19afc70a59f8bf759e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRawGameControllerStatics.ByReference::class)
public interface IRawGameControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_RawGameControllerAdded(value: EventHandler<RawGameController?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_RawGameControllerAdded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_RawGameControllerRemoved(value: EventHandler<RawGameController?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_RawGameControllerRemoved(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun get_RawGameControllers(): IVectorView<RawGameController?>?

  @InterfaceMethod(5)
  public fun FromGameController(gameController: IGameController?): RawGameController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRawGameControllerStatics> {
    public override fun getValue() = ABI.makeIRawGameControllerStatics(pointer.getPointer(0))

    public fun setValue(value: IRawGameControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRawGameControllerStatics {
    public val __419440990_Ptr: Pointer?

    public val _419440990_VtblPtr: Pointer?
      get() = __419440990_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_RawGameControllerAdded(value: EventHandler<RawGameController?>?):
        EventRegistrationToken? {
      val fnPtr = _419440990_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__419440990_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_RawGameControllerAdded(token: EventRegistrationToken?): Unit {
      val fnPtr = _419440990_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__419440990_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_RawGameControllerRemoved(value: EventHandler<RawGameController?>?):
        EventRegistrationToken? {
      val fnPtr = _419440990_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__419440990_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_RawGameControllerRemoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _419440990_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__419440990_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RawGameControllers(): IVectorView<RawGameController?>? {
      val fnPtr = _419440990_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<RawGameController?>>()
      val hr = fn.invokeHR(arrayOf(__419440990_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<RawGameController?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun FromGameController(gameController: IGameController?): RawGameController? {
      val fnPtr = _419440990_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RawGameController>()
      val hr = fn.invokeHR(arrayOf(__419440990_Ptr, marshalToNative(gameController), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RawGameController>(result.getValue())
      return resultValue
    }
  }

  public class IRawGameControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __419440990_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRawGameControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eb8d0792e95a4b19afc70a59f8bf759e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRawGameControllerStatics(ptr: Pointer?): WithDefault =
        IRawGameControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRawGameControllerStatics {
      val address = segment.toRawLongValue()
      return makeIRawGameControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: IRawGameControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__419440990_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRawGameControllerStatics):
        Array<IRawGameControllerStatics?> = (elements as
        Array<IRawGameControllerStatics?>).castToImpl<IRawGameControllerStatics,IRawGameControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRawGameControllerStatics?> =
        arrayOfNulls<IRawGameControllerStatics_Impl>(size) as Array<IRawGameControllerStatics?>
  }
}
