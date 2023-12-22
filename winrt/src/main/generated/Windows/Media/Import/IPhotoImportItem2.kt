package Windows.Media.Import

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

@ABIMarker(IPhotoImportItem2.ABI::class)
@Signature("{f1053505-f53b-46a3-9e30-3610791a9110}")
@Guid("f1053505f53b46a39e303610791a9110")
@WinRTInterface("f1053505f53b46a39e303610791a9110")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoImportItem2.ByReference::class)
public interface IPhotoImportItem2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Path(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoImportItem2> {
    public override fun getValue() = ABI.makeIPhotoImportItem2(pointer.getPointer(0))

    public fun setValue(value: IPhotoImportItem2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoImportItem2 {
    public val __560517097_Ptr: Pointer?

    public val _560517097_VtblPtr: Pointer?
      get() = __560517097_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Path(): String? {
      val fnPtr = _560517097_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__560517097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPhotoImportItem2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __560517097_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoImportItem2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f1053505f53b46a39e303610791a9110")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoImportItem2(ptr: Pointer?): WithDefault = IPhotoImportItem2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoImportItem2 {
      val address = segment.toRawLongValue()
      return makeIPhotoImportItem2(Pointer(address))
    }

    public override fun toNative(obj: IPhotoImportItem2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__560517097_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoImportItem2): Array<IPhotoImportItem2?> = (elements
        as Array<IPhotoImportItem2?>).castToImpl<IPhotoImportItem2,IPhotoImportItem2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoImportItem2?> =
        arrayOfNulls<IPhotoImportItem2_Impl>(size) as Array<IPhotoImportItem2?>
  }
}
