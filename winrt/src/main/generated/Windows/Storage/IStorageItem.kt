package Windows.Storage

import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Storage.FileProperties.BasicProperties
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageItem.ABI::class)
@Signature("{4207a996-ca2f-42f7-bde8-8b10457a7f30}")
@Guid("4207a996ca2f42f7bde88b10457a7f30")
@WinRTInterface("4207a996ca2f42f7bde88b10457a7f30")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageItem.ByReference::class)
public interface IStorageItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RenameAsync(desiredName: String?): IAsyncAction?

  @InterfaceMethod(1)
  public fun RenameAsync(desiredName: String?, option: NameCollisionOption?): IAsyncAction?

  @InterfaceMethod(2)
  public fun DeleteAsync(): IAsyncAction?

  @InterfaceMethod(3)
  public fun DeleteAsync(option: StorageDeleteOption?): IAsyncAction?

  @InterfaceMethod(4)
  public fun GetBasicPropertiesAsync(): IAsyncOperation<BasicProperties?>?

  @InterfaceMethod(5)
  public fun get_Name(): String?

  @InterfaceMethod(6)
  public fun get_Path(): String?

  @InterfaceMethod(7)
  public fun get_Attributes(): FileAttributes?

  @InterfaceMethod(8)
  public fun get_DateCreated(): DateTime?

  @InterfaceMethod(9)
  public fun IsOfType(type: StorageItemTypes?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStorageItem> {
    public override fun getValue() = ABI.makeIStorageItem(pointer.getPointer(0))

    public fun setValue(value: IStorageItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageItem {
    public val __507586037_Ptr: Pointer?

    public val _507586037_VtblPtr: Pointer?
      get() = __507586037_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RenameAsync(desiredName: String?): IAsyncAction? {
      val fnPtr = _507586037_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__507586037_Ptr, marshalToNative(desiredName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RenameAsync(desiredName: String?, option: NameCollisionOption?):
        IAsyncAction? {
      val fnPtr = _507586037_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__507586037_Ptr, marshalToNative(desiredName),
          marshalToNative(option), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun DeleteAsync(): IAsyncAction? {
      val fnPtr = _507586037_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__507586037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun DeleteAsync(option: StorageDeleteOption?): IAsyncAction? {
      val fnPtr = _507586037_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__507586037_Ptr, marshalToNative(option), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetBasicPropertiesAsync(): IAsyncOperation<BasicProperties?>? {
      val fnPtr = _507586037_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BasicProperties?>>()
      val hr = fn.invokeHR(arrayOf(__507586037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<BasicProperties?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Name(): String? {
      val fnPtr = _507586037_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__507586037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Path(): String? {
      val fnPtr = _507586037_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__507586037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Attributes(): FileAttributes? {
      val fnPtr = _507586037_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FileAttributes>()
      val hr = fn.invokeHR(arrayOf(__507586037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FileAttributes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_DateCreated(): DateTime? {
      val fnPtr = _507586037_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__507586037_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun IsOfType(type: StorageItemTypes?): Boolean {
      val fnPtr = _507586037_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__507586037_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IStorageItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __507586037_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4207a996ca2f42f7bde88b10457a7f30")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageItem(ptr: Pointer?): WithDefault = IStorageItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageItem {
      val address = segment.toRawLongValue()
      return makeIStorageItem(Pointer(address))
    }

    public override fun toNative(obj: IStorageItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__507586037_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageItem): Array<IStorageItem?> = (elements as
        Array<IStorageItem?>).castToImpl<IStorageItem,IStorageItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageItem?> =
        arrayOfNulls<IStorageItem_Impl>(size) as Array<IStorageItem?>
  }
}
