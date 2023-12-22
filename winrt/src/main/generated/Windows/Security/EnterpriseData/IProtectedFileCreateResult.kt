package Windows.Security.EnterpriseData

import Windows.Storage.StorageFile
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(IProtectedFileCreateResult.ABI::class)
@Signature("{28e3ed6a-e9e7-4a03-9f53-bdb16172699b}")
@Guid("28e3ed6ae9e74a039f53bdb16172699b")
@WinRTInterface("28e3ed6ae9e74a039f53bdb16172699b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProtectedFileCreateResult.ByReference::class)
public interface IProtectedFileCreateResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_File(): StorageFile?

  @InterfaceMethod(1)
  public fun get_Stream(): IRandomAccessStream?

  @InterfaceMethod(2)
  public fun get_ProtectionInfo(): FileProtectionInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProtectedFileCreateResult> {
    public override fun getValue() = ABI.makeIProtectedFileCreateResult(pointer.getPointer(0))

    public fun setValue(value: IProtectedFileCreateResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProtectedFileCreateResult {
    public val __2036526488_Ptr: Pointer?

    public val _2036526488_VtblPtr: Pointer?
      get() = __2036526488_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_File(): StorageFile? {
      val fnPtr = _2036526488_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFile>()
      val hr = fn.invokeHR(arrayOf(__2036526488_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Stream(): IRandomAccessStream? {
      val fnPtr = _2036526488_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStream>()
      val hr = fn.invokeHR(arrayOf(__2036526488_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ProtectionInfo(): FileProtectionInfo? {
      val fnPtr = _2036526488_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FileProtectionInfo>()
      val hr = fn.invokeHR(arrayOf(__2036526488_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FileProtectionInfo>(result.getValue())
      return resultValue
    }
  }

  public class IProtectedFileCreateResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2036526488_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProtectedFileCreateResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("28e3ed6ae9e74a039f53bdb16172699b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProtectedFileCreateResult(ptr: Pointer?): WithDefault =
        IProtectedFileCreateResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProtectedFileCreateResult {
      val address = segment.toRawLongValue()
      return makeIProtectedFileCreateResult(Pointer(address))
    }

    public override fun toNative(obj: IProtectedFileCreateResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2036526488_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProtectedFileCreateResult):
        Array<IProtectedFileCreateResult?> = (elements as
        Array<IProtectedFileCreateResult?>).castToImpl<IProtectedFileCreateResult,IProtectedFileCreateResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProtectedFileCreateResult?> =
        arrayOfNulls<IProtectedFileCreateResult_Impl>(size) as Array<IProtectedFileCreateResult?>
  }
}
