package Windows.Graphics.Printing3D

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

@ABIMarker(IPrinting3D3MFPackage2.ABI::class)
@Signature("{965c7ac4-93cb-4430-92b8-789cd454f883}")
@Guid("965c7ac493cb443092b8789cd454f883")
@WinRTInterface("965c7ac493cb443092b8789cd454f883")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrinting3D3MFPackage2.ByReference::class)
public interface IPrinting3D3MFPackage2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Compression(): Printing3DPackageCompression?

  @InterfaceMethod(1)
  public fun put_Compression(value: Printing3DPackageCompression?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrinting3D3MFPackage2> {
    public override fun getValue() = ABI.makeIPrinting3D3MFPackage2(pointer.getPointer(0))

    public fun setValue(value: IPrinting3D3MFPackage2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrinting3D3MFPackage2 {
    public val __667178503_Ptr: Pointer?

    public val _667178503_VtblPtr: Pointer?
      get() = __667178503_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Compression(): Printing3DPackageCompression? {
      val fnPtr = _667178503_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Printing3DPackageCompression>()
      val hr = fn.invokeHR(arrayOf(__667178503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Printing3DPackageCompression>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Compression(value: Printing3DPackageCompression?): Unit {
      val fnPtr = _667178503_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__667178503_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrinting3D3MFPackage2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __667178503_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrinting3D3MFPackage2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("965c7ac493cb443092b8789cd454f883")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrinting3D3MFPackage2(ptr: Pointer?): WithDefault =
        IPrinting3D3MFPackage2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrinting3D3MFPackage2 {
      val address = segment.toRawLongValue()
      return makeIPrinting3D3MFPackage2(Pointer(address))
    }

    public override fun toNative(obj: IPrinting3D3MFPackage2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__667178503_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrinting3D3MFPackage2): Array<IPrinting3D3MFPackage2?> =
        (elements as
        Array<IPrinting3D3MFPackage2?>).castToImpl<IPrinting3D3MFPackage2,IPrinting3D3MFPackage2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrinting3D3MFPackage2?> =
        arrayOfNulls<IPrinting3D3MFPackage2_Impl>(size) as Array<IPrinting3D3MFPackage2?>
  }
}
