package Windows.Storage.AccessCache

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Storage.AccessCache.IStorageItemAccessList.ABI.IID
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageItemMostRecentlyUsedList.ABI::class)
@Signature("{016239d5-510d-411e-8cf1-c3d1effa4c33}")
@Guid("016239d5510d411e8cf1c3d1effa4c33")
@WinRTInterface("016239d5510d411e8cf1c3d1effa4c33")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageItemMostRecentlyUsedList.ByReference::class)
public interface IStorageItemMostRecentlyUsedList : NativeMapped, IWinRTInterface,
    IStorageItemAccessList {
  @InterfaceMethod(0)
  public fun add_ItemRemoved(handler: TypedEventHandler<StorageItemMostRecentlyUsedList?,
      ItemRemovedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ItemRemoved(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageItemMostRecentlyUsedList> {
    public override fun getValue() = ABI.makeIStorageItemMostRecentlyUsedList(pointer.getPointer(0))

    public fun setValue(value: IStorageItemMostRecentlyUsedList_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageItemMostRecentlyUsedList,
      IStorageItemAccessList.WithDefault {
    public val __1997806101_Ptr: Pointer?

    public val _1997806101_VtblPtr: Pointer?
      get() = __1997806101_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_ItemRemoved(handler: TypedEventHandler<StorageItemMostRecentlyUsedList?,
        ItemRemovedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1997806101_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1997806101_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ItemRemoved(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1997806101_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1997806101_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorageItemMostRecentlyUsedList_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStorageItemAccessList {
    public override val __178972825_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1997806101_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1997806101_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageItemMostRecentlyUsedList, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("016239d5510d411e8cf1c3d1effa4c33")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageItemMostRecentlyUsedList(ptr: Pointer?): WithDefault =
        IStorageItemMostRecentlyUsedList_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageItemMostRecentlyUsedList {
      val address = segment.toRawLongValue()
      return makeIStorageItemMostRecentlyUsedList(Pointer(address))
    }

    public override fun toNative(obj: IStorageItemMostRecentlyUsedList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1997806101_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItemMostRecentlyUsedList):
        Array<IStorageItemMostRecentlyUsedList?> = (elements as
        Array<IStorageItemMostRecentlyUsedList?>).castToImpl<IStorageItemMostRecentlyUsedList,IStorageItemMostRecentlyUsedList_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItemMostRecentlyUsedList?> =
        arrayOfNulls<IStorageItemMostRecentlyUsedList_Impl>(size) as
        Array<IStorageItemMostRecentlyUsedList?>
  }
}
