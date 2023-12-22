package Windows.Gaming.Preview.GamesEnumeration

import Windows.ApplicationModel.AppDisplayInfo
import Windows.Foundation.Collections.IMapView
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGameListEntry.ABI::class)
@Signature("{735924d3-811f-4494-b69c-c641a0c61543}")
@Guid("735924d3811f4494b69cc641a0c61543")
@WinRTInterface("735924d3811f4494b69cc641a0c61543")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameListEntry.ByReference::class)
public interface IGameListEntry : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayInfo(): AppDisplayInfo?

  @InterfaceMethod(1)
  public fun LaunchAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun get_Category(): GameListCategory?

  @InterfaceMethod(3)
  public fun get_Properties(): IMapView<String?, IUnknown?>?

  @InterfaceMethod(4)
  public fun SetCategoryAsync(value: GameListCategory?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGameListEntry>
      {
    public override fun getValue() = ABI.makeIGameListEntry(pointer.getPointer(0))

    public fun setValue(value: IGameListEntry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameListEntry {
    public val __621623417_Ptr: Pointer?

    public val _621623417_VtblPtr: Pointer?
      get() = __621623417_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayInfo(): AppDisplayInfo? {
      val fnPtr = _621623417_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppDisplayInfo>()
      val hr = fn.invokeHR(arrayOf(__621623417_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppDisplayInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun LaunchAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _621623417_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__621623417_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Category(): GameListCategory? {
      val fnPtr = _621623417_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameListCategory>()
      val hr = fn.invokeHR(arrayOf(__621623417_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameListCategory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Properties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _621623417_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__621623417_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SetCategoryAsync(value: GameListCategory?): IAsyncAction? {
      val fnPtr = _621623417_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__621623417_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IGameListEntry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __621623417_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameListEntry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("735924d3811f4494b69cc641a0c61543")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameListEntry(ptr: Pointer?): WithDefault = IGameListEntry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameListEntry {
      val address = segment.toRawLongValue()
      return makeIGameListEntry(Pointer(address))
    }

    public override fun toNative(obj: IGameListEntry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__621623417_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameListEntry): Array<IGameListEntry?> = (elements as
        Array<IGameListEntry?>).castToImpl<IGameListEntry,IGameListEntry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameListEntry?> =
        arrayOfNulls<IGameListEntry_Impl>(size) as Array<IGameListEntry?>
  }
}
