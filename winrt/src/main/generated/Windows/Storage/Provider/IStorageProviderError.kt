package Windows.Storage.Provider

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

@ABIMarker(IStorageProviderError.ABI::class)
@Signature("{47f2780b-ef7f-5910-bf83-331d89256615}")
@Guid("47f2780bef7f5910bf83331d89256615")
@WinRTInterface("47f2780bef7f5910bf83331d89256615")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderError.ByReference::class)
public interface IStorageProviderError : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_Title(): String?

  @InterfaceMethod(2)
  public fun get_Message(): String?

  @InterfaceMethod(3)
  public fun get_FilePath(): String?

  @InterfaceMethod(4)
  public fun put_FilePath(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_PrimaryAction(): StorageProviderErrorCommand?

  @InterfaceMethod(6)
  public fun put_PrimaryAction(value: StorageProviderErrorCommand?): Unit

  @InterfaceMethod(7)
  public fun get_SecondaryAction(): StorageProviderErrorCommand?

  @InterfaceMethod(8)
  public fun put_SecondaryAction(value: StorageProviderErrorCommand?): Unit

  @InterfaceMethod(9)
  public fun get_InformationalLink(): StorageProviderErrorCommand?

  @InterfaceMethod(10)
  public fun put_InformationalLink(value: StorageProviderErrorCommand?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderError> {
    public override fun getValue() = ABI.makeIStorageProviderError(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderError_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderError {
    public val __2025407670_Ptr: Pointer?

    public val _2025407670_VtblPtr: Pointer?
      get() = __2025407670_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _2025407670_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2025407670_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Title(): String? {
      val fnPtr = _2025407670_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2025407670_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Message(): String? {
      val fnPtr = _2025407670_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2025407670_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FilePath(): String? {
      val fnPtr = _2025407670_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2025407670_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_FilePath(value: String?): Unit {
      val fnPtr = _2025407670_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2025407670_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_PrimaryAction(): StorageProviderErrorCommand? {
      val fnPtr = _2025407670_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderErrorCommand>()
      val hr = fn.invokeHR(arrayOf(__2025407670_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderErrorCommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_PrimaryAction(value: StorageProviderErrorCommand?): Unit {
      val fnPtr = _2025407670_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2025407670_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_SecondaryAction(): StorageProviderErrorCommand? {
      val fnPtr = _2025407670_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderErrorCommand>()
      val hr = fn.invokeHR(arrayOf(__2025407670_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderErrorCommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_SecondaryAction(value: StorageProviderErrorCommand?): Unit {
      val fnPtr = _2025407670_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2025407670_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_InformationalLink(): StorageProviderErrorCommand? {
      val fnPtr = _2025407670_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderErrorCommand>()
      val hr = fn.invokeHR(arrayOf(__2025407670_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderErrorCommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_InformationalLink(value: StorageProviderErrorCommand?): Unit {
      val fnPtr = _2025407670_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2025407670_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorageProviderError_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2025407670_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderError, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("47f2780bef7f5910bf83331d89256615")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderError(ptr: Pointer?): WithDefault =
        IStorageProviderError_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderError {
      val address = segment.toRawLongValue()
      return makeIStorageProviderError(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2025407670_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderError): Array<IStorageProviderError?> =
        (elements as
        Array<IStorageProviderError?>).castToImpl<IStorageProviderError,IStorageProviderError_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderError?> =
        arrayOfNulls<IStorageProviderError_Impl>(size) as Array<IStorageProviderError?>
  }
}
