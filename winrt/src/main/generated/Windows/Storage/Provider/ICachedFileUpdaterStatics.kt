package Windows.Storage.Provider

import Windows.Storage.IStorageFile
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

@ABIMarker(ICachedFileUpdaterStatics.ABI::class)
@Signature("{9fc90920-7bcf-4888-a81e-102d7034d7ce}")
@Guid("9fc909207bcf4888a81e102d7034d7ce")
@WinRTInterface("9fc909207bcf4888a81e102d7034d7ce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICachedFileUpdaterStatics.ByReference::class)
public interface ICachedFileUpdaterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetUpdateInformation(
    `file`: IStorageFile?,
    contentId: String?,
    readMode: ReadActivationMode?,
    writeMode: WriteActivationMode?,
    options: CachedFileOptions?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICachedFileUpdaterStatics> {
    public override fun getValue() = ABI.makeICachedFileUpdaterStatics(pointer.getPointer(0))

    public fun setValue(value: ICachedFileUpdaterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICachedFileUpdaterStatics {
    public val __798526476_Ptr: Pointer?

    public val _798526476_VtblPtr: Pointer?
      get() = __798526476_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetUpdateInformation(
      `file`: IStorageFile?,
      contentId: String?,
      readMode: ReadActivationMode?,
      writeMode: WriteActivationMode?,
      options: CachedFileOptions?
    ): Unit {
      val fnPtr = _798526476_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__798526476_Ptr, marshalToNative(file),
          marshalToNative(contentId), marshalToNative(readMode), marshalToNative(writeMode),
          marshalToNative(options),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICachedFileUpdaterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __798526476_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICachedFileUpdaterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9fc909207bcf4888a81e102d7034d7ce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICachedFileUpdaterStatics(ptr: Pointer?): WithDefault =
        ICachedFileUpdaterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICachedFileUpdaterStatics {
      val address = segment.toRawLongValue()
      return makeICachedFileUpdaterStatics(Pointer(address))
    }

    public override fun toNative(obj: ICachedFileUpdaterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__798526476_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICachedFileUpdaterStatics):
        Array<ICachedFileUpdaterStatics?> = (elements as
        Array<ICachedFileUpdaterStatics?>).castToImpl<ICachedFileUpdaterStatics,ICachedFileUpdaterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICachedFileUpdaterStatics?> =
        arrayOfNulls<ICachedFileUpdaterStatics_Impl>(size) as Array<ICachedFileUpdaterStatics?>
  }
}
