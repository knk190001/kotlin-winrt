package Windows.Management.Deployment

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IPackageManager4.ABI::class)
@Signature("{3c719963-bab6-46bf-8ff7-da4719230ae6}")
@Guid("3c719963bab646bf8ff7da4719230ae6")
@WinRTInterface("3c719963bab646bf8ff7da4719230ae6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageManager4.ByReference::class)
public interface IPackageManager4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetPackageVolumesAsync(): IAsyncOperation<IVectorView<PackageVolume?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageManager4> {
    public override fun getValue() = ABI.makeIPackageManager4(pointer.getPointer(0))

    public fun setValue(value: IPackageManager4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageManager4 {
    public val __438863625_Ptr: Pointer?

    public val _438863625_VtblPtr: Pointer?
      get() = __438863625_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetPackageVolumesAsync(): IAsyncOperation<IVectorView<PackageVolume?>?>? {
      val fnPtr = _438863625_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<PackageVolume?>?>>()
      val hr = fn.invokeHR(arrayOf(__438863625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<PackageVolume?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IPackageManager4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __438863625_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageManager4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c719963bab646bf8ff7da4719230ae6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageManager4(ptr: Pointer?): WithDefault = IPackageManager4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageManager4 {
      val address = segment.toRawLongValue()
      return makeIPackageManager4(Pointer(address))
    }

    public override fun toNative(obj: IPackageManager4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__438863625_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageManager4): Array<IPackageManager4?> = (elements as
        Array<IPackageManager4?>).castToImpl<IPackageManager4,IPackageManager4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageManager4?> =
        arrayOfNulls<IPackageManager4_Impl>(size) as Array<IPackageManager4?>
  }
}
