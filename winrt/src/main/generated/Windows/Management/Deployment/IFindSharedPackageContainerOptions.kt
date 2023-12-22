package Windows.Management.Deployment

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

@ABIMarker(IFindSharedPackageContainerOptions.ABI::class)
@Signature("{b40fc8fe-8384-54cc-817d-ae09d3b6a606}")
@Guid("b40fc8fe838454cc817dae09d3b6a606")
@WinRTInterface("b40fc8fe838454cc817dae09d3b6a606")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFindSharedPackageContainerOptions.ByReference::class)
public interface IFindSharedPackageContainerOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_PackageFamilyName(): String?

  @InterfaceMethod(3)
  public fun put_PackageFamilyName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFindSharedPackageContainerOptions> {
    public override fun getValue() =
        ABI.makeIFindSharedPackageContainerOptions(pointer.getPointer(0))

    public fun setValue(value: IFindSharedPackageContainerOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFindSharedPackageContainerOptions {
    public val __291418783_Ptr: Pointer?

    public val _291418783_VtblPtr: Pointer?
      get() = __291418783_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _291418783_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__291418783_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _291418783_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__291418783_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PackageFamilyName(): String? {
      val fnPtr = _291418783_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__291418783_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_PackageFamilyName(value: String?): Unit {
      val fnPtr = _291418783_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__291418783_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFindSharedPackageContainerOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __291418783_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFindSharedPackageContainerOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b40fc8fe838454cc817dae09d3b6a606")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFindSharedPackageContainerOptions(ptr: Pointer?): WithDefault =
        IFindSharedPackageContainerOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFindSharedPackageContainerOptions {
      val address = segment.toRawLongValue()
      return makeIFindSharedPackageContainerOptions(Pointer(address))
    }

    public override fun toNative(obj: IFindSharedPackageContainerOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__291418783_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFindSharedPackageContainerOptions):
        Array<IFindSharedPackageContainerOptions?> = (elements as
        Array<IFindSharedPackageContainerOptions?>).castToImpl<IFindSharedPackageContainerOptions,IFindSharedPackageContainerOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFindSharedPackageContainerOptions?> =
        arrayOfNulls<IFindSharedPackageContainerOptions_Impl>(size) as
        Array<IFindSharedPackageContainerOptions?>
  }
}
