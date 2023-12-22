package Windows.Networking.Connectivity

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILanIdentifierData.ABI::class)
@Signature("{a74e83c3-d639-45be-a36a-c4e4aeaf6d9b}")
@Guid("a74e83c3d63945bea36ac4e4aeaf6d9b")
@WinRTInterface("a74e83c3d63945bea36ac4e4aeaf6d9b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILanIdentifierData.ByReference::class)
public interface ILanIdentifierData : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Value(): IVectorView<Byte>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILanIdentifierData> {
    public override fun getValue() = ABI.makeILanIdentifierData(pointer.getPointer(0))

    public fun setValue(value: ILanIdentifierData_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILanIdentifierData {
    public val __369491191_Ptr: Pointer?

    public val _369491191_VtblPtr: Pointer?
      get() = __369491191_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): WinDef.UINT {
      val fnPtr = _369491191_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__369491191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Value(): IVectorView<Byte>? {
      val fnPtr = _369491191_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Byte>>()
      val hr = fn.invokeHR(arrayOf(__369491191_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Byte>>(result.getValue())
      return resultValue
    }
  }

  public class ILanIdentifierData_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __369491191_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILanIdentifierData, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a74e83c3d63945bea36ac4e4aeaf6d9b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILanIdentifierData(ptr: Pointer?): WithDefault = ILanIdentifierData_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILanIdentifierData {
      val address = segment.toRawLongValue()
      return makeILanIdentifierData(Pointer(address))
    }

    public override fun toNative(obj: ILanIdentifierData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__369491191_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILanIdentifierData): Array<ILanIdentifierData?> =
        (elements as
        Array<ILanIdentifierData?>).castToImpl<ILanIdentifierData,ILanIdentifierData_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILanIdentifierData?> =
        arrayOfNulls<ILanIdentifierData_Impl>(size) as Array<ILanIdentifierData?>
  }
}
