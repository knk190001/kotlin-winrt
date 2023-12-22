package Windows.UI.Xaml.Controls.Maps

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IMapScene.ABI::class)
@Signature("{8bba10a9-50e7-482c-9789-c688b178ac24}")
@Guid("8bba10a950e7482c9789c688b178ac24")
@WinRTInterface("8bba10a950e7482c9789c688b178ac24")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapScene.ByReference::class)
public interface IMapScene : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetCamera(): MapCamera?

  @InterfaceMethod(1)
  public fun add_TargetCameraChanged(handler: TypedEventHandler<MapScene?,
      MapTargetCameraChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_TargetCameraChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapScene> {
    public override fun getValue() = ABI.makeIMapScene(pointer.getPointer(0))

    public fun setValue(value: IMapScene_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapScene {
    public val __1340872479_Ptr: Pointer?

    public val _1340872479_VtblPtr: Pointer?
      get() = __1340872479_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetCamera(): MapCamera? {
      val fnPtr = _1340872479_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapCamera>()
      val hr = fn.invokeHR(arrayOf(__1340872479_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapCamera>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_TargetCameraChanged(handler: TypedEventHandler<MapScene?,
        MapTargetCameraChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1340872479_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1340872479_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_TargetCameraChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1340872479_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1340872479_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapScene_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1340872479_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapScene, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8bba10a950e7482c9789c688b178ac24")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapScene(ptr: Pointer?): WithDefault = IMapScene_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapScene {
      val address = segment.toRawLongValue()
      return makeIMapScene(Pointer(address))
    }

    public override fun toNative(obj: IMapScene): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1340872479_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapScene): Array<IMapScene?> = (elements as
        Array<IMapScene?>).castToImpl<IMapScene,IMapScene_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapScene?> = arrayOfNulls<IMapScene_Impl>(size)
        as Array<IMapScene?>
  }
}
