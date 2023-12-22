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

@ABIMarker(IDataPackageView4.ABI::class)
@Signature("{dfe96f1f-e042-4433-a09f-26d6ffda8b85}")
@Guid("dfe96f1fe0424433a09f26d6ffda8b85")
@WinRTInterface("dfe96f1fe0424433a09f26d6ffda8b85")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPackageView4.ByReference::class)
public interface IDataPackageView4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetAcceptedFormatId(formatId: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataPackageView4> {
    public override fun getValue() = ABI.makeIDataPackageView4(pointer.getPointer(0))

    public fun setValue(value: IDataPackageView4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPackageView4 {
    public val __1138264291_Ptr: Pointer?

    public val _1138264291_VtblPtr: Pointer?
      get() = __1138264291_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetAcceptedFormatId(formatId: String?): Unit {
      val fnPtr = _1138264291_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1138264291_Ptr, marshalToNative(formatId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDataPackageView4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1138264291_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPackageView4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dfe96f1fe0424433a09f26d6ffda8b85")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPackageView4(ptr: Pointer?): WithDefault = IDataPackageView4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPackageView4 {
      val address = segment.toRawLongValue()
      return makeIDataPackageView4(Pointer(address))
    }

    public override fun toNative(obj: IDataPackageView4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1138264291_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPackageView4): Array<IDataPackageView4?> = (elements
        as Array<IDataPackageView4?>).castToImpl<IDataPackageView4,IDataPackageView4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPackageView4?> =
        arrayOfNulls<IDataPackageView4_Impl>(size) as Array<IDataPackageView4?>
  }
}
