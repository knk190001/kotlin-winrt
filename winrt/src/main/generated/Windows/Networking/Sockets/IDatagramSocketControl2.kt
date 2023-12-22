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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IDatagramSocketControl2.ABI::class)
@Signature("{33ead5c2-979c-4415-82a1-3cfaf646c192}")
@Guid("33ead5c2979c441582a13cfaf646c192")
@WinRTInterface("33ead5c2979c441582a13cfaf646c192")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatagramSocketControl2.ByReference::class)
public interface IDatagramSocketControl2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InboundBufferSizeInBytes(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_InboundBufferSizeInBytes(value: WinDef.UINT): Unit

  @InterfaceMethod(2)
  public fun get_DontFragment(): Boolean

  @InterfaceMethod(3)
  public fun put_DontFragment(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatagramSocketControl2> {
    public override fun getValue() = ABI.makeIDatagramSocketControl2(pointer.getPointer(0))

    public fun setValue(value: IDatagramSocketControl2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatagramSocketControl2 {
    public val __1770949855_Ptr: Pointer?

    public val _1770949855_VtblPtr: Pointer?
      get() = __1770949855_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InboundBufferSizeInBytes(): WinDef.UINT {
      val fnPtr = _1770949855_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1770949855_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_InboundBufferSizeInBytes(value: WinDef.UINT): Unit {
      val fnPtr = _1770949855_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1770949855_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DontFragment(): Boolean {
      val fnPtr = _1770949855_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1770949855_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_DontFragment(value: Boolean): Unit {
      val fnPtr = _1770949855_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1770949855_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDatagramSocketControl2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1770949855_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatagramSocketControl2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33ead5c2979c441582a13cfaf646c192")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatagramSocketControl2(ptr: Pointer?): WithDefault =
        IDatagramSocketControl2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatagramSocketControl2 {
      val address = segment.toRawLongValue()
      return makeIDatagramSocketControl2(Pointer(address))
    }

    public override fun toNative(obj: IDatagramSocketControl2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1770949855_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatagramSocketControl2): Array<IDatagramSocketControl2?>
        = (elements as
        Array<IDatagramSocketControl2?>).castToImpl<IDatagramSocketControl2,IDatagramSocketControl2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatagramSocketControl2?> =
        arrayOfNulls<IDatagramSocketControl2_Impl>(size) as Array<IDatagramSocketControl2?>
  }
}
