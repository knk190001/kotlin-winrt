package Windows.Graphics.Effects

import Windows.Graphics.Effects.IGraphicsEffectSource.ABI.IID
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGraphicsEffect.ABI::class)
@Signature("{cb51c0ce-8fe6-4636-b202-861faa07d8f3}")
@Guid("cb51c0ce8fe64636b202861faa07d8f3")
@WinRTInterface("cb51c0ce8fe64636b202861faa07d8f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGraphicsEffect.ByReference::class)
public interface IGraphicsEffect : NativeMapped, IWinRTInterface, IGraphicsEffectSource {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun put_Name(name: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGraphicsEffect> {
    public override fun getValue() = ABI.makeIGraphicsEffect(pointer.getPointer(0))

    public fun setValue(value: IGraphicsEffect_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGraphicsEffect, IGraphicsEffectSource.WithDefault {
    public val __2076412261_Ptr: Pointer?

    public val _2076412261_VtblPtr: Pointer?
      get() = __2076412261_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _2076412261_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2076412261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Name(name: String?): Unit {
      val fnPtr = _2076412261_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2076412261_Ptr, marshalToNative(name),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGraphicsEffect_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGraphicsEffectSource {
    public override val __568797846_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2076412261_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2076412261_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGraphicsEffect, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb51c0ce8fe64636b202861faa07d8f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGraphicsEffect(ptr: Pointer?): WithDefault = IGraphicsEffect_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGraphicsEffect {
      val address = segment.toRawLongValue()
      return makeIGraphicsEffect(Pointer(address))
    }

    public override fun toNative(obj: IGraphicsEffect): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2076412261_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGraphicsEffect): Array<IGraphicsEffect?> = (elements as
        Array<IGraphicsEffect?>).castToImpl<IGraphicsEffect,IGraphicsEffect_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGraphicsEffect?> =
        arrayOfNulls<IGraphicsEffect_Impl>(size) as Array<IGraphicsEffect?>
  }
}
