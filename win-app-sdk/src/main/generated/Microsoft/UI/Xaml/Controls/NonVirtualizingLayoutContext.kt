package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.INonVirtualizingLayoutContextFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(NonVirtualizingLayoutContext.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.NonVirtualizingLayoutContext;{1e378538-f33c-5410-82cc-ca6f06d5e259})")
@WinRTByReference(brClass = NonVirtualizingLayoutContext.ByReference::class)
public open class NonVirtualizingLayoutContext(
  ptr: JNAPointer? = NULL
) : LayoutContext(ptr), INonVirtualizingLayoutContext.WithDefault,
    INonVirtualizingLayoutContextOverrides.WithDefault, IWinRTObject {
  private val __1016834343_Interface: INonVirtualizingLayoutContext.WithDefault by lazy {
    as_1016834343()
  }


  private val __702821554_Interface: INonVirtualizingLayoutContextOverrides.WithDefault by lazy {
    as_702821554()
  }


  public override val __1016834343_Ptr: JNAPointer? by lazy {
    __1016834343_Interface.__1016834343_Ptr
  }


  public override val __702821554_Ptr: JNAPointer? by lazy {
    __702821554_Interface.__702821554_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1016834343_Interface, __702821554_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1016834343(): INonVirtualizingLayoutContext.WithDefault {
    if(pointer == NULL) {
      return(INonVirtualizingLayoutContext.ABI.makeINonVirtualizingLayoutContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INonVirtualizingLayoutContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INonVirtualizingLayoutContext.ABI.makeINonVirtualizingLayoutContext(ref.value))
  }

  private fun as_702821554(): INonVirtualizingLayoutContextOverrides.WithDefault {
    if(pointer == NULL) {
      return(INonVirtualizingLayoutContextOverrides.ABI.makeINonVirtualizingLayoutContextOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INonVirtualizingLayoutContextOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INonVirtualizingLayoutContextOverrides.ABI.makeINonVirtualizingLayoutContextOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NonVirtualizingLayoutContext> {
    public override fun getValue() = NonVirtualizingLayoutContext(pointer.getPointer(0))

    public fun setValue(value: NonVirtualizingLayoutContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NonVirtualizingLayoutContext, MemoryAddress> {
    public val INonVirtualizingLayoutContextFactory_Instance: INonVirtualizingLayoutContextFactory
        by lazy {
      createINonVirtualizingLayoutContextFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createINonVirtualizingLayoutContextFactory(): INonVirtualizingLayoutContextFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.NonVirtualizingLayoutContext".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(INonVirtualizingLayoutContextFactory.ABI.makeINonVirtualizingLayoutContextFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? =
        INonVirtualizingLayoutContextFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): NonVirtualizingLayoutContext {
      val address = segment.toRawLongValue()
      return NonVirtualizingLayoutContext(Pointer(address))
    }

    public override fun toNative(obj: NonVirtualizingLayoutContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
