package Windows.Storage

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IApplicationData3.ABI::class)
@Signature("{dc222cf4-2772-4c1d-aa2c-c9f743ade8d1}")
@Guid("dc222cf427724c1daa2cc9f743ade8d1")
@WinRTInterface("dc222cf427724c1daa2cc9f743ade8d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationData3.ByReference::class)
public interface IApplicationData3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetPublisherCacheFolder(folderName: String?): StorageFolder?

  @InterfaceMethod(1)
  public fun ClearPublisherCacheFolderAsync(folderName: String?): IAsyncAction?

  @InterfaceMethod(2)
  public fun get_SharedLocalFolder(): StorageFolder?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationData3> {
    public override fun getValue() = ABI.makeIApplicationData3(pointer.getPointer(0))

    public fun setValue(value: IApplicationData3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationData3 {
    public val __253967602_Ptr: Pointer?

    public val _253967602_VtblPtr: Pointer?
      get() = __253967602_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetPublisherCacheFolder(folderName: String?): StorageFolder? {
      val fnPtr = _253967602_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__253967602_Ptr, marshalToNative(folderName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ClearPublisherCacheFolderAsync(folderName: String?): IAsyncAction? {
      val fnPtr = _253967602_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__253967602_Ptr, marshalToNative(folderName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SharedLocalFolder(): StorageFolder? {
      val fnPtr = _253967602_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageFolder>()
      val hr = fn.invokeHR(arrayOf(__253967602_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageFolder>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationData3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __253967602_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationData3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dc222cf427724c1daa2cc9f743ade8d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationData3(ptr: Pointer?): WithDefault = IApplicationData3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationData3 {
      val address = segment.toRawLongValue()
      return makeIApplicationData3(Pointer(address))
    }

    public override fun toNative(obj: IApplicationData3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__253967602_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationData3): Array<IApplicationData3?> = (elements
        as Array<IApplicationData3?>).castToImpl<IApplicationData3,IApplicationData3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationData3?> =
        arrayOfNulls<IApplicationData3_Impl>(size) as Array<IApplicationData3?>
  }
}
