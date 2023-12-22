package Windows.System.Profile.SystemManufacturers

import Windows.Foundation.Uri
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

@ABIMarker(IOemSupportInfo.ABI::class)
@Signature("{8d2eae55-87ef-4266-86d0-c4afbeb29bb9}")
@Guid("8d2eae5587ef426686d0c4afbeb29bb9")
@WinRTInterface("8d2eae5587ef426686d0c4afbeb29bb9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOemSupportInfo.ByReference::class)
public interface IOemSupportInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SupportLink(): Uri?

  @InterfaceMethod(1)
  public fun get_SupportAppLink(): Uri?

  @InterfaceMethod(2)
  public fun get_SupportProvider(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOemSupportInfo> {
    public override fun getValue() = ABI.makeIOemSupportInfo(pointer.getPointer(0))

    public fun setValue(value: IOemSupportInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOemSupportInfo {
    public val __1658405781_Ptr: Pointer?

    public val _1658405781_VtblPtr: Pointer?
      get() = __1658405781_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SupportLink(): Uri? {
      val fnPtr = _1658405781_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1658405781_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SupportAppLink(): Uri? {
      val fnPtr = _1658405781_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1658405781_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SupportProvider(): String? {
      val fnPtr = _1658405781_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1658405781_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IOemSupportInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1658405781_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOemSupportInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8d2eae5587ef426686d0c4afbeb29bb9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOemSupportInfo(ptr: Pointer?): WithDefault = IOemSupportInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOemSupportInfo {
      val address = segment.toRawLongValue()
      return makeIOemSupportInfo(Pointer(address))
    }

    public override fun toNative(obj: IOemSupportInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1658405781_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOemSupportInfo): Array<IOemSupportInfo?> = (elements as
        Array<IOemSupportInfo?>).castToImpl<IOemSupportInfo,IOemSupportInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOemSupportInfo?> =
        arrayOfNulls<IOemSupportInfo_Impl>(size) as Array<IOemSupportInfo?>
  }
}
