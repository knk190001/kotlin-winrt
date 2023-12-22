package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.Uri
import Windows.Storage.Streams.IRandomAccessStreamReference
import Windows.UI.Color
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

@ABIMarker(IDataPackagePropertySet2.ABI::class)
@Signature("{eb505d4a-9800-46aa-b181-7b6f0f2b919a}")
@Guid("eb505d4a980046aab1817b6f0f2b919a")
@WinRTInterface("eb505d4a980046aab1817b6f0f2b919a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPackagePropertySet2.ByReference::class)
public interface IDataPackagePropertySet2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentSourceWebLink(): Uri?

  @InterfaceMethod(1)
  public fun put_ContentSourceWebLink(value: Uri?): Unit

  @InterfaceMethod(2)
  public fun get_ContentSourceApplicationLink(): Uri?

  @InterfaceMethod(3)
  public fun put_ContentSourceApplicationLink(value: Uri?): Unit

  @InterfaceMethod(4)
  public fun get_PackageFamilyName(): String?

  @InterfaceMethod(5)
  public fun put_PackageFamilyName(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_Square30x30Logo(): IRandomAccessStreamReference?

  @InterfaceMethod(7)
  public fun put_Square30x30Logo(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(8)
  public fun get_LogoBackgroundColor(): Color?

  @InterfaceMethod(9)
  public fun put_LogoBackgroundColor(value: Color?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataPackagePropertySet2> {
    public override fun getValue() = ABI.makeIDataPackagePropertySet2(pointer.getPointer(0))

    public fun setValue(value: IDataPackagePropertySet2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPackagePropertySet2 {
    public val __761722153_Ptr: Pointer?

    public val _761722153_VtblPtr: Pointer?
      get() = __761722153_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentSourceWebLink(): Uri? {
      val fnPtr = _761722153_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__761722153_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ContentSourceWebLink(value: Uri?): Unit {
      val fnPtr = _761722153_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__761722153_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ContentSourceApplicationLink(): Uri? {
      val fnPtr = _761722153_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__761722153_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ContentSourceApplicationLink(value: Uri?): Unit {
      val fnPtr = _761722153_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__761722153_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PackageFamilyName(): String? {
      val fnPtr = _761722153_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__761722153_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_PackageFamilyName(value: String?): Unit {
      val fnPtr = _761722153_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__761722153_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Square30x30Logo(): IRandomAccessStreamReference? {
      val fnPtr = _761722153_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__761722153_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Square30x30Logo(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _761722153_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__761722153_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_LogoBackgroundColor(): Color? {
      val fnPtr = _761722153_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__761722153_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_LogoBackgroundColor(value: Color?): Unit {
      val fnPtr = _761722153_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__761722153_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDataPackagePropertySet2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __761722153_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPackagePropertySet2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eb505d4a980046aab1817b6f0f2b919a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPackagePropertySet2(ptr: Pointer?): WithDefault =
        IDataPackagePropertySet2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPackagePropertySet2 {
      val address = segment.toRawLongValue()
      return makeIDataPackagePropertySet2(Pointer(address))
    }

    public override fun toNative(obj: IDataPackagePropertySet2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__761722153_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPackagePropertySet2):
        Array<IDataPackagePropertySet2?> = (elements as
        Array<IDataPackagePropertySet2?>).castToImpl<IDataPackagePropertySet2,IDataPackagePropertySet2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPackagePropertySet2?> =
        arrayOfNulls<IDataPackagePropertySet2_Impl>(size) as Array<IDataPackagePropertySet2?>
  }
}
