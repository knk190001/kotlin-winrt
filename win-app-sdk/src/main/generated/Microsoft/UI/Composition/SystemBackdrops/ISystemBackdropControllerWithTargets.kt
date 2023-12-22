package Microsoft.UI.Composition.SystemBackdrops

import Microsoft.UI.Composition.ICompositionSupportsSystemBackdrop
import Microsoft.UI.Composition.SystemBackdrops.ISystemBackdropController.ABI.IID
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ISystemBackdropControllerWithTargets.ABI::class)
@Signature("{9c56fe7c-98eb-5f89-ad97-dad57fc30c8c}")
@Guid("9c56fe7c98eb5f89ad97dad57fc30c8c")
@WinRTInterface("9c56fe7c98eb5f89ad97dad57fc30c8c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemBackdropControllerWithTargets.ByReference::class)
public interface ISystemBackdropControllerWithTargets : NativeMapped, IWinRTInterface,
    ISystemBackdropController, IClosable {
  @InterfaceMethod(0)
  public fun get_State(): SystemBackdropState?

  @InterfaceMethod(1)
  public fun AddSystemBackdropTarget(systemBackdropTarget: ICompositionSupportsSystemBackdrop?):
      Boolean

  @InterfaceMethod(2)
  public fun RemoveAllSystemBackdropTargets(): Unit

  @InterfaceMethod(3)
  public fun RemoveSystemBackdropTarget(systemBackdropTarget: ICompositionSupportsSystemBackdrop?):
      Boolean

  @InterfaceMethod(4)
  public fun SetSystemBackdropConfiguration(configuration: SystemBackdropConfiguration?): Unit

  @InterfaceMethod(5)
  public fun add_StateChanged(handler: TypedEventHandler<ISystemBackdropControllerWithTargets?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_StateChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemBackdropControllerWithTargets> {
    public override fun getValue() =
        ABI.makeISystemBackdropControllerWithTargets(pointer.getPointer(0))

    public fun setValue(value: ISystemBackdropControllerWithTargets_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemBackdropControllerWithTargets,
      ISystemBackdropController.WithDefault, IClosable.WithDefault {
    public val __1896265250_Ptr: Pointer?

    public val _1896265250_VtblPtr: Pointer?
      get() = __1896265250_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_State(): SystemBackdropState? {
      val fnPtr = _1896265250_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemBackdropState>()
      val hr = fn.invokeHR(arrayOf(__1896265250_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemBackdropState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun AddSystemBackdropTarget(systemBackdropTarget: ICompositionSupportsSystemBackdrop?):
        Boolean {
      val fnPtr = _1896265250_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1896265250_Ptr, marshalToNative(systemBackdropTarget), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun RemoveAllSystemBackdropTargets(): Unit {
      val fnPtr = _1896265250_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1896265250_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override
        fun RemoveSystemBackdropTarget(systemBackdropTarget: ICompositionSupportsSystemBackdrop?):
        Boolean {
      val fnPtr = _1896265250_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1896265250_Ptr, marshalToNative(systemBackdropTarget), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun SetSystemBackdropConfiguration(configuration: SystemBackdropConfiguration?):
        Unit {
      val fnPtr = _1896265250_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1896265250_Ptr, marshalToNative(configuration),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override
        fun add_StateChanged(handler: TypedEventHandler<ISystemBackdropControllerWithTargets?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1896265250_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1896265250_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_StateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1896265250_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1896265250_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemBackdropControllerWithTargets_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISystemBackdropController,
      IClosable {
    public override val __1664869082_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1896265250_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1896265250_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1896265250_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemBackdropControllerWithTargets, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9c56fe7c98eb5f89ad97dad57fc30c8c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemBackdropControllerWithTargets(ptr: Pointer?): WithDefault =
        ISystemBackdropControllerWithTargets_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemBackdropControllerWithTargets {
      val address = segment.toRawLongValue()
      return makeISystemBackdropControllerWithTargets(Pointer(address))
    }

    public override fun toNative(obj: ISystemBackdropControllerWithTargets): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1896265250_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemBackdropControllerWithTargets):
        Array<ISystemBackdropControllerWithTargets?> = (elements as
        Array<ISystemBackdropControllerWithTargets?>).castToImpl<ISystemBackdropControllerWithTargets,ISystemBackdropControllerWithTargets_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemBackdropControllerWithTargets?> =
        arrayOfNulls<ISystemBackdropControllerWithTargets_Impl>(size) as
        Array<ISystemBackdropControllerWithTargets?>
  }
}
