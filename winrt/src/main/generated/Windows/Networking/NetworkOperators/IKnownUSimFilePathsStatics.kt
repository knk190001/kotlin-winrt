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

@ABIMarker(IKnownUSimFilePathsStatics.ABI::class)
@Signature("{7c34e581-1f1b-43f4-9530-8b092d32d71f}")
@Guid("7c34e5811f1b43f495308b092d32d71f")
@WinRTInterface("7c34e5811f1b43f495308b092d32d71f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownUSimFilePathsStatics.ByReference::class)
public interface IKnownUSimFilePathsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EFSpn(): IVectorView<WinDef.UINT>?

  @InterfaceMethod(1)
  public fun get_EFOpl(): IVectorView<WinDef.UINT>?

  @InterfaceMethod(2)
  public fun get_EFPnn(): IVectorView<WinDef.UINT>?

  @InterfaceMethod(3)
  public fun get_Gid1(): IVectorView<WinDef.UINT>?

  @InterfaceMethod(4)
  public fun get_Gid2(): IVectorView<WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownUSimFilePathsStatics> {
    public override fun getValue() = ABI.makeIKnownUSimFilePathsStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownUSimFilePathsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownUSimFilePathsStatics {
    public val __1783377185_Ptr: Pointer?

    public val _1783377185_VtblPtr: Pointer?
      get() = __1783377185_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EFSpn(): IVectorView<WinDef.UINT>? {
      val fnPtr = _1783377185_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1783377185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EFOpl(): IVectorView<WinDef.UINT>? {
      val fnPtr = _1783377185_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1783377185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_EFPnn(): IVectorView<WinDef.UINT>? {
      val fnPtr = _1783377185_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1783377185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Gid1(): IVectorView<WinDef.UINT>? {
      val fnPtr = _1783377185_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1783377185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Gid2(): IVectorView<WinDef.UINT>? {
      val fnPtr = _1783377185_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1783377185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class IKnownUSimFilePathsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1783377185_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownUSimFilePathsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c34e5811f1b43f495308b092d32d71f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownUSimFilePathsStatics(ptr: Pointer?): WithDefault =
        IKnownUSimFilePathsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKnownUSimFilePathsStatics {
      val address = segment.toRawLongValue()
      return makeIKnownUSimFilePathsStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownUSimFilePathsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1783377185_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownUSimFilePathsStatics):
        Array<IKnownUSimFilePathsStatics?> = (elements as
        Array<IKnownUSimFilePathsStatics?>).castToImpl<IKnownUSimFilePathsStatics,IKnownUSimFilePathsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownUSimFilePathsStatics?> =
        arrayOfNulls<IKnownUSimFilePathsStatics_Impl>(size) as Array<IKnownUSimFilePathsStatics?>
  }
}
