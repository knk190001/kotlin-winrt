package Windows.ApplicationModel

import Windows.Foundation.DateTime
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

@ABIMarker(IPackageWithMetadata.ABI::class)
@Signature("{95949780-1de9-40f2-b452-0de9f1910012}")
@Guid("959497801de940f2b4520de9f1910012")
@WinRTInterface("959497801de940f2b4520de9f1910012")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageWithMetadata.ByReference::class)
public interface IPackageWithMetadata : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InstallDate(): DateTime?

  @InterfaceMethod(1)
  public fun GetThumbnailToken(): String?

  @InterfaceMethod(2)
  public fun Launch(parameters: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageWithMetadata> {
    public override fun getValue() = ABI.makeIPackageWithMetadata(pointer.getPointer(0))

    public fun setValue(value: IPackageWithMetadata_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageWithMetadata {
    public val __1090981770_Ptr: Pointer?

    public val _1090981770_VtblPtr: Pointer?
      get() = __1090981770_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InstallDate(): DateTime? {
      val fnPtr = _1090981770_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1090981770_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetThumbnailToken(): String? {
      val fnPtr = _1090981770_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1090981770_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Launch(parameters: String?): Unit {
      val fnPtr = _1090981770_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1090981770_Ptr, marshalToNative(parameters),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPackageWithMetadata_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1090981770_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageWithMetadata, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("959497801de940f2b4520de9f1910012")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageWithMetadata(ptr: Pointer?): WithDefault = IPackageWithMetadata_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageWithMetadata {
      val address = segment.toRawLongValue()
      return makeIPackageWithMetadata(Pointer(address))
    }

    public override fun toNative(obj: IPackageWithMetadata): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1090981770_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageWithMetadata): Array<IPackageWithMetadata?> =
        (elements as
        Array<IPackageWithMetadata?>).castToImpl<IPackageWithMetadata,IPackageWithMetadata_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageWithMetadata?> =
        arrayOfNulls<IPackageWithMetadata_Impl>(size) as Array<IPackageWithMetadata?>
  }
}
