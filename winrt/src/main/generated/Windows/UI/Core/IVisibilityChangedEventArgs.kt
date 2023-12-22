package Windows.UI.Core

import Windows.UI.Core.ICoreWindowEventArgs.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IVisibilityChangedEventArgs.ABI::class)
@Signature("{bf9918ea-d801-4564-a495-b1e84f8ad085}")
@Guid("bf9918ead8014564a495b1e84f8ad085")
@WinRTInterface("bf9918ead8014564a495b1e84f8ad085")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisibilityChangedEventArgs.ByReference::class)
public interface IVisibilityChangedEventArgs : NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
  @InterfaceMethod(0)
  public fun get_Visible(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVisibilityChangedEventArgs> {
    public override fun getValue() = ABI.makeIVisibilityChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IVisibilityChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisibilityChangedEventArgs, ICoreWindowEventArgs.WithDefault {
    public val __434012560_Ptr: Pointer?

    public val _434012560_VtblPtr: Pointer?
      get() = __434012560_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Visible(): Boolean {
      val fnPtr = _434012560_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__434012560_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IVisibilityChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
    public override val __407060269_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_434012560_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __434012560_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisibilityChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bf9918ead8014564a495b1e84f8ad085")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisibilityChangedEventArgs(ptr: Pointer?): WithDefault =
        IVisibilityChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisibilityChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIVisibilityChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IVisibilityChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__434012560_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisibilityChangedEventArgs):
        Array<IVisibilityChangedEventArgs?> = (elements as
        Array<IVisibilityChangedEventArgs?>).castToImpl<IVisibilityChangedEventArgs,IVisibilityChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisibilityChangedEventArgs?> =
        arrayOfNulls<IVisibilityChangedEventArgs_Impl>(size) as Array<IVisibilityChangedEventArgs?>
  }
}
