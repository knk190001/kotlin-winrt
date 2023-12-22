package Windows.Media.Import

import Windows.Foundation.Collections.IVectorView
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IPhotoImportVideoSegment.ABI::class)
@Signature("{623c0289-321a-41d8-9166-8c62a333276c}")
@Guid("623c0289321a41d891668c62a333276c")
@WinRTInterface("623c0289321a41d891668c62a333276c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhotoImportVideoSegment.ByReference::class)
public interface IPhotoImportVideoSegment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_SizeInBytes(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun get_Date(): DateTime?

  @InterfaceMethod(3)
  public fun get_Sibling(): PhotoImportSidecar?

  @InterfaceMethod(4)
  public fun get_Sidecars(): IVectorView<PhotoImportSidecar?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhotoImportVideoSegment> {
    public override fun getValue() = ABI.makeIPhotoImportVideoSegment(pointer.getPointer(0))

    public fun setValue(value: IPhotoImportVideoSegment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhotoImportVideoSegment {
    public val __1752665760_Ptr: Pointer?

    public val _1752665760_VtblPtr: Pointer?
      get() = __1752665760_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1752665760_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1752665760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SizeInBytes(): WinDef.ULONG {
      val fnPtr = _1752665760_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1752665760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Date(): DateTime? {
      val fnPtr = _1752665760_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1752665760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Sibling(): PhotoImportSidecar? {
      val fnPtr = _1752665760_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhotoImportSidecar>()
      val hr = fn.invokeHR(arrayOf(__1752665760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhotoImportSidecar>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Sidecars(): IVectorView<PhotoImportSidecar?>? {
      val fnPtr = _1752665760_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PhotoImportSidecar?>>()
      val hr = fn.invokeHR(arrayOf(__1752665760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PhotoImportSidecar?>>(result.getValue())
      return resultValue
    }
  }

  public class IPhotoImportVideoSegment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1752665760_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhotoImportVideoSegment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("623c0289321a41d891668c62a333276c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhotoImportVideoSegment(ptr: Pointer?): WithDefault =
        IPhotoImportVideoSegment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhotoImportVideoSegment {
      val address = segment.toRawLongValue()
      return makeIPhotoImportVideoSegment(Pointer(address))
    }

    public override fun toNative(obj: IPhotoImportVideoSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1752665760_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhotoImportVideoSegment):
        Array<IPhotoImportVideoSegment?> = (elements as
        Array<IPhotoImportVideoSegment?>).castToImpl<IPhotoImportVideoSegment,IPhotoImportVideoSegment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhotoImportVideoSegment?> =
        arrayOfNulls<IPhotoImportVideoSegment_Impl>(size) as Array<IPhotoImportVideoSegment?>
  }
}
