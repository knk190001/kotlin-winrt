package Windows.Storage

import Windows.Foundation.IAsyncOperation
import Windows.Storage.IStorageItem.ABI.IID
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageItem2.ABI::class)
@Signature("{53f926d2-083c-4283-b45b-81c007237e44}")
@Guid("53f926d2083c4283b45b81c007237e44")
@WinRTInterface("53f926d2083c4283b45b81c007237e44")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageItem2.ByReference::class)
public interface IStorageItem2 : NativeMapped, IWinRTInterface, IStorageItem {
  @InterfaceMethod(0)
  public fun GetParentAsync(): IAsyncOperation<StorageFolder?>?

  @InterfaceMethod(1)
  public fun IsEqual(item: IStorageItem?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStorageItem2>
      {
    public override fun getValue() = ABI.makeIStorageItem2(pointer.getPointer(0))

    public fun setValue(value: IStorageItem2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageItem2, IStorageItem.WithDefault {
    public val __1444701987_Ptr: Pointer?

    public val _1444701987_VtblPtr: Pointer?
      get() = __1444701987_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetParentAsync(): IAsyncOperation<StorageFolder?>? {
      val fnPtr = _1444701987_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorageFolder?>>()
      val hr = fn.invokeHR(arrayOf(__1444701987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorageFolder?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun IsEqual(item: IStorageItem?): Boolean {
      val fnPtr = _1444701987_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1444701987_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IStorageItem2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IStorageItem {
    public override val __507586037_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1444701987_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1444701987_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageItem2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53f926d2083c4283b45b81c007237e44")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageItem2(ptr: Pointer?): WithDefault = IStorageItem2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageItem2 {
      val address = segment.toRawLongValue()
      return makeIStorageItem2(Pointer(address))
    }

    public override fun toNative(obj: IStorageItem2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1444701987_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItem2): Array<IStorageItem2?> = (elements as
        Array<IStorageItem2?>).castToImpl<IStorageItem2,IStorageItem2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItem2?> =
        arrayOfNulls<IStorageItem2_Impl>(size) as Array<IStorageItem2?>
  }
}
