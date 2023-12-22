package Windows.UI.Xaml

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IDataTemplateKey.ABI::class)
@Signature("{873b6c28-cceb-4b61-86fa-b2cec39cc2fa}")
@Guid("873b6c28cceb4b6186fab2cec39cc2fa")
@WinRTInterface("873b6c28cceb4b6186fab2cec39cc2fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataTemplateKey.ByReference::class)
public interface IDataTemplateKey : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DataType(): IUnknown?

  @InterfaceMethod(1)
  public fun put_DataType(value: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataTemplateKey> {
    public override fun getValue() = ABI.makeIDataTemplateKey(pointer.getPointer(0))

    public fun setValue(value: IDataTemplateKey_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataTemplateKey {
    public val __1382415127_Ptr: Pointer?

    public val _1382415127_VtblPtr: Pointer?
      get() = __1382415127_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DataType(): IUnknown? {
      val fnPtr = _1382415127_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1382415127_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DataType(value: IUnknown?): Unit {
      val fnPtr = _1382415127_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1382415127_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDataTemplateKey_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1382415127_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataTemplateKey, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("873b6c28cceb4b6186fab2cec39cc2fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataTemplateKey(ptr: Pointer?): WithDefault = IDataTemplateKey_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataTemplateKey {
      val address = segment.toRawLongValue()
      return makeIDataTemplateKey(Pointer(address))
    }

    public override fun toNative(obj: IDataTemplateKey): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1382415127_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataTemplateKey): Array<IDataTemplateKey?> = (elements as
        Array<IDataTemplateKey?>).castToImpl<IDataTemplateKey,IDataTemplateKey_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataTemplateKey?> =
        arrayOfNulls<IDataTemplateKey_Impl>(size) as Array<IDataTemplateKey?>
  }
}
