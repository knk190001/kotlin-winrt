package Windows.Security.EnterpriseData

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFileUnprotectOptionsFactory.ABI::class)
@Signature("{51aeb39c-da8c-4c3f-9bfb-cb73a7cce0dd}")
@Guid("51aeb39cda8c4c3f9bfbcb73a7cce0dd")
@WinRTInterface("51aeb39cda8c4c3f9bfbcb73a7cce0dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileUnprotectOptionsFactory.ByReference::class)
public interface IFileUnprotectOptionsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(audit: Boolean): FileUnprotectOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileUnprotectOptionsFactory> {
    public override fun getValue() = ABI.makeIFileUnprotectOptionsFactory(pointer.getPointer(0))

    public fun setValue(value: IFileUnprotectOptionsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileUnprotectOptionsFactory {
    public val __946127701_Ptr: Pointer?

    public val _946127701_VtblPtr: Pointer?
      get() = __946127701_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(audit: Boolean): FileUnprotectOptions? {
      val fnPtr = _946127701_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FileUnprotectOptions>()
      val hr = fn.invokeHR(arrayOf(__946127701_Ptr, audit, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FileUnprotectOptions>(result.getValue())
      return resultValue
    }
  }

  public class IFileUnprotectOptionsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __946127701_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileUnprotectOptionsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("51aeb39cda8c4c3f9bfbcb73a7cce0dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileUnprotectOptionsFactory(ptr: Pointer?): WithDefault =
        IFileUnprotectOptionsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileUnprotectOptionsFactory {
      val address = segment.toRawLongValue()
      return makeIFileUnprotectOptionsFactory(Pointer(address))
    }

    public override fun toNative(obj: IFileUnprotectOptionsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__946127701_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileUnprotectOptionsFactory):
        Array<IFileUnprotectOptionsFactory?> = (elements as
        Array<IFileUnprotectOptionsFactory?>).castToImpl<IFileUnprotectOptionsFactory,IFileUnprotectOptionsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileUnprotectOptionsFactory?> =
        arrayOfNulls<IFileUnprotectOptionsFactory_Impl>(size) as
        Array<IFileUnprotectOptionsFactory?>
  }
}
