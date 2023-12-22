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

@ABIMarker(IDataPackagePropertySetView4.ABI::class)
@Signature("{4474c80d-d16f-40ae-9580-6f8562b94235}")
@Guid("4474c80dd16f40ae95806f8562b94235")
@WinRTInterface("4474c80dd16f40ae95806f8562b94235")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPackagePropertySetView4.ByReference::class)
public interface IDataPackagePropertySetView4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentSourceUserActivityJson(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataPackagePropertySetView4> {
    public override fun getValue() = ABI.makeIDataPackagePropertySetView4(pointer.getPointer(0))

    public fun setValue(value: IDataPackagePropertySetView4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPackagePropertySetView4 {
    public val __2030459444_Ptr: Pointer?

    public val _2030459444_VtblPtr: Pointer?
      get() = __2030459444_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentSourceUserActivityJson(): String? {
      val fnPtr = _2030459444_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2030459444_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IDataPackagePropertySetView4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2030459444_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPackagePropertySetView4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4474c80dd16f40ae95806f8562b94235")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPackagePropertySetView4(ptr: Pointer?): WithDefault =
        IDataPackagePropertySetView4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPackagePropertySetView4 {
      val address = segment.toRawLongValue()
      return makeIDataPackagePropertySetView4(Pointer(address))
    }

    public override fun toNative(obj: IDataPackagePropertySetView4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2030459444_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPackagePropertySetView4):
        Array<IDataPackagePropertySetView4?> = (elements as
        Array<IDataPackagePropertySetView4?>).castToImpl<IDataPackagePropertySetView4,IDataPackagePropertySetView4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPackagePropertySetView4?> =
        arrayOfNulls<IDataPackagePropertySetView4_Impl>(size) as
        Array<IDataPackagePropertySetView4?>
  }
}
