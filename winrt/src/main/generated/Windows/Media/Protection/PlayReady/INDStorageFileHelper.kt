package Windows.Media.Protection.PlayReady

import Windows.Foundation.Collections.IVector
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

@ABIMarker(INDStorageFileHelper.ABI::class)
@Signature("{d8f0bef8-91d2-4d47-a3f9-eaff4edb729f}")
@Guid("d8f0bef891d24d47a3f9eaff4edb729f")
@WinRTInterface("d8f0bef891d24d47a3f9eaff4edb729f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDStorageFileHelper.ByReference::class)
public interface INDStorageFileHelper : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFileURLs(`file`: IStorageFile?): IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INDStorageFileHelper> {
    public override fun getValue() = ABI.makeINDStorageFileHelper(pointer.getPointer(0))

    public fun setValue(value: INDStorageFileHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDStorageFileHelper {
    public val __736056843_Ptr: Pointer?

    public val _736056843_VtblPtr: Pointer?
      get() = __736056843_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFileURLs(`file`: IStorageFile?): IVector<String?>? {
      val fnPtr = _736056843_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__736056843_Ptr, marshalToNative(file), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class INDStorageFileHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __736056843_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDStorageFileHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d8f0bef891d24d47a3f9eaff4edb729f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDStorageFileHelper(ptr: Pointer?): WithDefault = INDStorageFileHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDStorageFileHelper {
      val address = segment.toRawLongValue()
      return makeINDStorageFileHelper(Pointer(address))
    }

    public override fun toNative(obj: INDStorageFileHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__736056843_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDStorageFileHelper): Array<INDStorageFileHelper?> =
        (elements as
        Array<INDStorageFileHelper?>).castToImpl<INDStorageFileHelper,INDStorageFileHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDStorageFileHelper?> =
        arrayOfNulls<INDStorageFileHelper_Impl>(size) as Array<INDStorageFileHelper?>
  }
}
