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

@ABIMarker(IDataPackagePropertySet4.ABI::class)
@Signature("{6390ebf5-1739-4c74-b22f-865fab5e8545}")
@Guid("6390ebf517394c74b22f865fab5e8545")
@WinRTInterface("6390ebf517394c74b22f865fab5e8545")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPackagePropertySet4.ByReference::class)
public interface IDataPackagePropertySet4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentSourceUserActivityJson(): String?

  @InterfaceMethod(1)
  public fun put_ContentSourceUserActivityJson(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataPackagePropertySet4> {
    public override fun getValue() = ABI.makeIDataPackagePropertySet4(pointer.getPointer(0))

    public fun setValue(value: IDataPackagePropertySet4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPackagePropertySet4 {
    public val __761722151_Ptr: Pointer?

    public val _761722151_VtblPtr: Pointer?
      get() = __761722151_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentSourceUserActivityJson(): String? {
      val fnPtr = _761722151_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__761722151_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ContentSourceUserActivityJson(value: String?): Unit {
      val fnPtr = _761722151_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__761722151_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDataPackagePropertySet4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __761722151_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPackagePropertySet4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6390ebf517394c74b22f865fab5e8545")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPackagePropertySet4(ptr: Pointer?): WithDefault =
        IDataPackagePropertySet4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPackagePropertySet4 {
      val address = segment.toRawLongValue()
      return makeIDataPackagePropertySet4(Pointer(address))
    }

    public override fun toNative(obj: IDataPackagePropertySet4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__761722151_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPackagePropertySet4):
        Array<IDataPackagePropertySet4?> = (elements as
        Array<IDataPackagePropertySet4?>).castToImpl<IDataPackagePropertySet4,IDataPackagePropertySet4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPackagePropertySet4?> =
        arrayOfNulls<IDataPackagePropertySet4_Impl>(size) as Array<IDataPackagePropertySet4?>
  }
}
