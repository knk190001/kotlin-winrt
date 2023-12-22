package Windows.Storage.AccessCache

import Windows.Storage.AccessCache.IStorageItemMostRecentlyUsedList.ABI.IID
import Windows.Storage.IStorageItem
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageItemMostRecentlyUsedList2.ABI::class)
@Signature("{da481ea0-ed8d-4731-a1db-e44ee2204093}")
@Guid("da481ea0ed8d4731a1dbe44ee2204093")
@WinRTInterface("da481ea0ed8d4731a1dbe44ee2204093")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageItemMostRecentlyUsedList2.ByReference::class)
public interface IStorageItemMostRecentlyUsedList2 : NativeMapped, IWinRTInterface,
    IStorageItemMostRecentlyUsedList, IStorageItemAccessList {
  @InterfaceMethod(0)
  public fun Add(
    `file`: IStorageItem?,
    metadata: String?,
    visibility: RecentStorageItemVisibility?
  ): String?

  @InterfaceMethod(1)
  public fun AddOrReplace(
    token: String?,
    `file`: IStorageItem?,
    metadata: String?,
    visibility: RecentStorageItemVisibility?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageItemMostRecentlyUsedList2> {
    public override fun getValue() =
        ABI.makeIStorageItemMostRecentlyUsedList2(pointer.getPointer(0))

    public fun setValue(value: IStorageItemMostRecentlyUsedList2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageItemMostRecentlyUsedList2,
      IStorageItemMostRecentlyUsedList.WithDefault, IStorageItemAccessList.WithDefault {
    public val __1802446937_Ptr: Pointer?

    public val _1802446937_VtblPtr: Pointer?
      get() = __1802446937_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Add(
      `file`: IStorageItem?,
      metadata: String?,
      visibility: RecentStorageItemVisibility?
    ): String? {
      val fnPtr = _1802446937_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1802446937_Ptr, marshalToNative(file),
          marshalToNative(metadata), marshalToNative(visibility), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun AddOrReplace(
      token: String?,
      `file`: IStorageItem?,
      metadata: String?,
      visibility: RecentStorageItemVisibility?
    ): Unit {
      val fnPtr = _1802446937_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1802446937_Ptr, marshalToNative(token), marshalToNative(file),
          marshalToNative(metadata), marshalToNative(visibility),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorageItemMostRecentlyUsedList2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IStorageItemMostRecentlyUsedList, IStorageItemAccessList {
    public override val __1997806101_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1802446937_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __178972825_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IStorageItemAccessList.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1802446937_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1802446937_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageItemMostRecentlyUsedList2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da481ea0ed8d4731a1dbe44ee2204093")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageItemMostRecentlyUsedList2(ptr: Pointer?): WithDefault =
        IStorageItemMostRecentlyUsedList2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageItemMostRecentlyUsedList2 {
      val address = segment.toRawLongValue()
      return makeIStorageItemMostRecentlyUsedList2(Pointer(address))
    }

    public override fun toNative(obj: IStorageItemMostRecentlyUsedList2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1802446937_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItemMostRecentlyUsedList2):
        Array<IStorageItemMostRecentlyUsedList2?> = (elements as
        Array<IStorageItemMostRecentlyUsedList2?>).castToImpl<IStorageItemMostRecentlyUsedList2,IStorageItemMostRecentlyUsedList2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItemMostRecentlyUsedList2?> =
        arrayOfNulls<IStorageItemMostRecentlyUsedList2_Impl>(size) as
        Array<IStorageItemMostRecentlyUsedList2?>
  }
}
