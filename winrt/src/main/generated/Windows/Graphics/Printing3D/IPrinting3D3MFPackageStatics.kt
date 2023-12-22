package Windows.Graphics.Printing3D

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(IPrinting3D3MFPackageStatics.ABI::class)
@Signature("{7058d9af-7a9a-4787-b817-f6f459214823}")
@Guid("7058d9af7a9a4787b817f6f459214823")
@WinRTInterface("7058d9af7a9a4787b817f6f459214823")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3D3MFPackageStatics.ByReference::class)
public interface IPrinting3D3MFPackageStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LoadAsync(value: IRandomAccessStream?): IAsyncOperation<Printing3D3MFPackage?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3D3MFPackageStatics> {
    public override fun getValue() = ABI.makeIPrinting3D3MFPackageStatics(pointer.getPointer(0))

    public fun setValue(value: IPrinting3D3MFPackageStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3D3MFPackageStatics {
    public val __1406895686_Ptr: Pointer?

    public val _1406895686_VtblPtr: Pointer?
      get() = __1406895686_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LoadAsync(value: IRandomAccessStream?):
        IAsyncOperation<Printing3D3MFPackage?>? {
      val fnPtr = _1406895686_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Printing3D3MFPackage?>>()
      val hr = fn.invokeHR(arrayOf(__1406895686_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Printing3D3MFPackage?>>(result.getValue())
      return resultValue
    }
  }

  public class IPrinting3D3MFPackageStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1406895686_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3D3MFPackageStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7058d9af7a9a4787b817f6f459214823")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3D3MFPackageStatics(ptr: Pointer?): WithDefault =
        IPrinting3D3MFPackageStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3D3MFPackageStatics {
      val address = segment.toRawLongValue()
      return makeIPrinting3D3MFPackageStatics(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3D3MFPackageStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1406895686_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3D3MFPackageStatics):
        Array<IPrinting3D3MFPackageStatics?> = (elements as
        Array<IPrinting3D3MFPackageStatics?>).castToImpl<IPrinting3D3MFPackageStatics,IPrinting3D3MFPackageStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3D3MFPackageStatics?> =
        arrayOfNulls<IPrinting3D3MFPackageStatics_Impl>(size) as
        Array<IPrinting3D3MFPackageStatics?>
  }
}
