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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDataPackagePropertySetView5.ABI::class)
@Signature("{6f0a9445-3760-50bb-8523-c4202ded7d78}")
@Guid("6f0a9445376050bb8523c4202ded7d78")
@WinRTInterface("6f0a9445376050bb8523c4202ded7d78")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPackagePropertySetView5.ByReference::class)
public interface IDataPackagePropertySetView5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsFromRoamingClipboard(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataPackagePropertySetView5> {
    public override fun getValue() = ABI.makeIDataPackagePropertySetView5(pointer.getPointer(0))

    public fun setValue(value: IDataPackagePropertySetView5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPackagePropertySetView5 {
    public val __2030459445_Ptr: Pointer?

    public val _2030459445_VtblPtr: Pointer?
      get() = __2030459445_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsFromRoamingClipboard(): Boolean {
      val fnPtr = _2030459445_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2030459445_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IDataPackagePropertySetView5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2030459445_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPackagePropertySetView5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f0a9445376050bb8523c4202ded7d78")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPackagePropertySetView5(ptr: Pointer?): WithDefault =
        IDataPackagePropertySetView5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPackagePropertySetView5 {
      val address = segment.toRawLongValue()
      return makeIDataPackagePropertySetView5(Pointer(address))
    }

    public override fun toNative(obj: IDataPackagePropertySetView5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2030459445_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPackagePropertySetView5):
        Array<IDataPackagePropertySetView5?> = (elements as
        Array<IDataPackagePropertySetView5?>).castToImpl<IDataPackagePropertySetView5,IDataPackagePropertySetView5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPackagePropertySetView5?> =
        arrayOfNulls<IDataPackagePropertySetView5_Impl>(size) as
        Array<IDataPackagePropertySetView5?>
  }
}
