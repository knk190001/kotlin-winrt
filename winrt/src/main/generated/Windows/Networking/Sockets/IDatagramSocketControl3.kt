package Windows.Networking.Sockets

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

@ABIMarker(IDatagramSocketControl3.ABI::class)
@Signature("{d4eb8256-1f6d-4598-9b57-d42a001df349}")
@Guid("d4eb82561f6d45989b57d42a001df349")
@WinRTInterface("d4eb82561f6d45989b57d42a001df349")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatagramSocketControl3.ByReference::class)
public interface IDatagramSocketControl3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MulticastOnly(): Boolean

  @InterfaceMethod(1)
  public fun put_MulticastOnly(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatagramSocketControl3> {
    public override fun getValue() = ABI.makeIDatagramSocketControl3(pointer.getPointer(0))

    public fun setValue(value: IDatagramSocketControl3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatagramSocketControl3 {
    public val __1770949854_Ptr: Pointer?

    public val _1770949854_VtblPtr: Pointer?
      get() = __1770949854_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MulticastOnly(): Boolean {
      val fnPtr = _1770949854_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1770949854_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_MulticastOnly(value: Boolean): Unit {
      val fnPtr = _1770949854_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1770949854_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDatagramSocketControl3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1770949854_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatagramSocketControl3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4eb82561f6d45989b57d42a001df349")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatagramSocketControl3(ptr: Pointer?): WithDefault =
        IDatagramSocketControl3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatagramSocketControl3 {
      val address = segment.toRawLongValue()
      return makeIDatagramSocketControl3(Pointer(address))
    }

    public override fun toNative(obj: IDatagramSocketControl3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1770949854_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatagramSocketControl3): Array<IDatagramSocketControl3?>
        = (elements as
        Array<IDatagramSocketControl3?>).castToImpl<IDatagramSocketControl3,IDatagramSocketControl3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatagramSocketControl3?> =
        arrayOfNulls<IDatagramSocketControl3_Impl>(size) as Array<IDatagramSocketControl3?>
  }
}
