package Windows.Networking.NetworkOperators

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IKnownRuimFilePathsStatics.ABI::class)
@Signature("{3883c8b9-ff24-4571-a867-09f960426e14}")
@Guid("3883c8b9ff244571a86709f960426e14")
@WinRTInterface("3883c8b9ff244571a86709f960426e14")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownRuimFilePathsStatics.ByReference::class)
public interface IKnownRuimFilePathsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EFSpn(): IVectorView<WinDef.UINT>?

  @InterfaceMethod(1)
  public fun get_Gid1(): IVectorView<WinDef.UINT>?

  @InterfaceMethod(2)
  public fun get_Gid2(): IVectorView<WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownRuimFilePathsStatics> {
    public override fun getValue() = ABI.makeIKnownRuimFilePathsStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownRuimFilePathsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownRuimFilePathsStatics {
    public val __795822948_Ptr: Pointer?

    public val _795822948_VtblPtr: Pointer?
      get() = __795822948_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EFSpn(): IVectorView<WinDef.UINT>? {
      val fnPtr = _795822948_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__795822948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Gid1(): IVectorView<WinDef.UINT>? {
      val fnPtr = _795822948_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__795822948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Gid2(): IVectorView<WinDef.UINT>? {
      val fnPtr = _795822948_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__795822948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IKnownRuimFilePathsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __795822948_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownRuimFilePathsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3883c8b9ff244571a86709f960426e14")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownRuimFilePathsStatics(ptr: Pointer?): WithDefault =
        IKnownRuimFilePathsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKnownRuimFilePathsStatics {
      val address = segment.toRawLongValue()
      return makeIKnownRuimFilePathsStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownRuimFilePathsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__795822948_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownRuimFilePathsStatics):
        Array<IKnownRuimFilePathsStatics?> = (elements as
        Array<IKnownRuimFilePathsStatics?>).castToImpl<IKnownRuimFilePathsStatics,IKnownRuimFilePathsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownRuimFilePathsStatics?> =
        arrayOfNulls<IKnownRuimFilePathsStatics_Impl>(size) as Array<IKnownRuimFilePathsStatics?>
  }
}
