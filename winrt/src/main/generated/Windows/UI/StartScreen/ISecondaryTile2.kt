package Windows.UI.StartScreen

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.StartScreen.ISecondaryTile.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISecondaryTile2.ABI::class)
@Signature("{b2f6cc35-3250-4990-923c-294ab4b694dd}")
@Guid("b2f6cc3532504990923c294ab4b694dd")
@WinRTInterface("b2f6cc3532504990923c294ab4b694dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecondaryTile2.ByReference::class)
public interface ISecondaryTile2 : NativeMapped, IWinRTInterface, ISecondaryTile {
  @InterfaceMethod(0)
  public fun put_PhoneticName(value: String?): Unit

  @InterfaceMethod(1)
  public fun get_PhoneticName(): String?

  @InterfaceMethod(2)
  public fun get_VisualElements(): SecondaryTileVisualElements?

  @InterfaceMethod(3)
  public fun put_RoamingEnabled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_RoamingEnabled(): Boolean

  @InterfaceMethod(5)
  public fun add_VisualElementsRequested(handler: TypedEventHandler<SecondaryTile?,
      VisualElementsRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_VisualElementsRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryTile2> {
    public override fun getValue() = ABI.makeISecondaryTile2(pointer.getPointer(0))

    public fun setValue(value: ISecondaryTile2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryTile2, ISecondaryTile.WithDefault {
    public val __606565146_Ptr: Pointer?

    public val _606565146_VtblPtr: Pointer?
      get() = __606565146_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_PhoneticName(value: String?): Unit {
      val fnPtr = _606565146_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__606565146_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_PhoneticName(): String? {
      val fnPtr = _606565146_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__606565146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_VisualElements(): SecondaryTileVisualElements? {
      val fnPtr = _606565146_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SecondaryTileVisualElements>()
      val hr = fn.invokeHR(arrayOf(__606565146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SecondaryTileVisualElements>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_RoamingEnabled(value: Boolean): Unit {
      val fnPtr = _606565146_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__606565146_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RoamingEnabled(): Boolean {
      val fnPtr = _606565146_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__606565146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun add_VisualElementsRequested(handler: TypedEventHandler<SecondaryTile?,
        VisualElementsRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _606565146_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__606565146_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_VisualElementsRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _606565146_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__606565146_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISecondaryTile2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISecondaryTile {
    public override val __19566616_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_606565146_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __606565146_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryTile2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2f6cc3532504990923c294ab4b694dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryTile2(ptr: Pointer?): WithDefault = ISecondaryTile2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISecondaryTile2 {
      val address = segment.toRawLongValue()
      return makeISecondaryTile2(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryTile2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__606565146_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryTile2): Array<ISecondaryTile2?> = (elements as
        Array<ISecondaryTile2?>).castToImpl<ISecondaryTile2,ISecondaryTile2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISecondaryTile2?> =
        arrayOfNulls<ISecondaryTile2_Impl>(size) as Array<ISecondaryTile2?>
  }
}
