package Windows.Gaming.Preview.GamesEnumeration

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IGameListStatics.ABI::class)
@Signature("{2ddd0f6f-9c66-4b05-945c-d6ed78491b8c}")
@Guid("2ddd0f6f9c664b05945cd6ed78491b8c")
@WinRTInterface("2ddd0f6f9c664b05945cd6ed78491b8c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameListStatics.ByReference::class)
public interface IGameListStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindAllAsync(): IAsyncOperation<IVectorView<GameListEntry?>?>?

  @InterfaceMethod(1)
  public fun FindAllAsync(packageFamilyName: String?):
      IAsyncOperation<IVectorView<GameListEntry?>?>?

  @InterfaceMethod(2)
  public fun add_GameAdded(handler: GameListChangedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_GameAdded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_GameRemoved(handler: GameListRemovedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_GameRemoved(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_GameUpdated(handler: GameListChangedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_GameUpdated(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameListStatics> {
    public override fun getValue() = ABI.makeIGameListStatics(pointer.getPointer(0))

    public fun setValue(value: IGameListStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameListStatics {
    public val __74074636_Ptr: Pointer?

    public val _74074636_VtblPtr: Pointer?
      get() = __74074636_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindAllAsync(): IAsyncOperation<IVectorView<GameListEntry?>?>? {
      val fnPtr = _74074636_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<GameListEntry?>?>>()
      val hr = fn.invokeHR(arrayOf(__74074636_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<GameListEntry?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FindAllAsync(packageFamilyName: String?):
        IAsyncOperation<IVectorView<GameListEntry?>?>? {
      val fnPtr = _74074636_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<GameListEntry?>?>>()
      val hr = fn.invokeHR(arrayOf(__74074636_Ptr, marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<GameListEntry?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_GameAdded(handler: GameListChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _74074636_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__74074636_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_GameAdded(token: EventRegistrationToken?): Unit {
      val fnPtr = _74074636_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__74074636_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_GameRemoved(handler: GameListRemovedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _74074636_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__74074636_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_GameRemoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _74074636_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__74074636_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_GameUpdated(handler: GameListChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _74074636_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__74074636_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_GameUpdated(token: EventRegistrationToken?): Unit {
      val fnPtr = _74074636_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__74074636_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGameListStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __74074636_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameListStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ddd0f6f9c664b05945cd6ed78491b8c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameListStatics(ptr: Pointer?): WithDefault = IGameListStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameListStatics {
      val address = segment.toRawLongValue()
      return makeIGameListStatics(Pointer(address))
    }

    public override fun toNative(obj: IGameListStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__74074636_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameListStatics): Array<IGameListStatics?> = (elements as
        Array<IGameListStatics?>).castToImpl<IGameListStatics,IGameListStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameListStatics?> =
        arrayOfNulls<IGameListStatics_Impl>(size) as Array<IGameListStatics?>
  }
}
