package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(IDataPackagePropertySet3.ABI::class)
@Signature("{9e87fd9b-5205-401b-874a-455653bd39e8}")
@Guid("9e87fd9b5205401b874a455653bd39e8")
@WinRTInterface("9e87fd9b5205401b874a455653bd39e8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPackagePropertySet3.ByReference::class)
public interface IDataPackagePropertySet3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EnterpriseId(): String?

  @InterfaceMethod(1)
  public fun put_EnterpriseId(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataPackagePropertySet3> {
    public override fun getValue() = ABI.makeIDataPackagePropertySet3(pointer.getPointer(0))

    public fun setValue(value: IDataPackagePropertySet3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPackagePropertySet3 {
    public val __761722152_Ptr: Pointer?

    public val _761722152_VtblPtr: Pointer?
      get() = __761722152_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EnterpriseId(): String? {
      val fnPtr = _761722152_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__761722152_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_EnterpriseId(value: String?): Unit {
      val fnPtr = _761722152_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__761722152_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDataPackagePropertySet3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __761722152_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPackagePropertySet3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e87fd9b5205401b874a455653bd39e8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPackagePropertySet3(ptr: Pointer?): WithDefault =
        IDataPackagePropertySet3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPackagePropertySet3 {
      val address = segment.toRawLongValue()
      return makeIDataPackagePropertySet3(Pointer(address))
    }

    public override fun toNative(obj: IDataPackagePropertySet3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__761722152_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPackagePropertySet3):
        Array<IDataPackagePropertySet3?> = (elements as
        Array<IDataPackagePropertySet3?>).castToImpl<IDataPackagePropertySet3,IDataPackagePropertySet3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPackagePropertySet3?> =
        arrayOfNulls<IDataPackagePropertySet3_Impl>(size) as Array<IDataPackagePropertySet3?>
  }
}
