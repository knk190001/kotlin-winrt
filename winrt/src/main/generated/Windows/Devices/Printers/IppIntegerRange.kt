package Windows.Devices.Printers

import Windows.Devices.Printers.IIppIntegerRangeFactory.ABI.IID
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(IppIntegerRange.ABI::class)
@Signature("rc(Windows.Devices.Printers.IppIntegerRange;{92907346-c3ea-5ed6-bdb1-3752c62c6f7f})")
@WinRTByReference(brClass = IppIntegerRange.ByReference::class)
public class IppIntegerRange(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIppIntegerRange.WithDefault, IWinRTObject {
  private val __11471404_Interface: IIppIntegerRange.WithDefault by lazy {
    as_11471404()
  }


  public override val __11471404_Ptr: JNAPointer? by lazy {
    __11471404_Interface.__11471404_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__11471404_Interface)

  public constructor(start: Int, end: Int) : this(ABI.activate(start, end))

  private fun as_11471404(): IIppIntegerRange.WithDefault {
    if(pointer == NULL) {
      return(IIppIntegerRange.ABI.makeIIppIntegerRange(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIppIntegerRange>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIppIntegerRange.ABI.makeIIppIntegerRange(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IppIntegerRange> {
    public override fun getValue() = IppIntegerRange(pointer.getPointer(0))

    public fun setValue(value: IppIntegerRange): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IppIntegerRange, MemoryAddress> {
    public val IIppIntegerRangeFactory_Instance: IIppIntegerRangeFactory by lazy {
      createIIppIntegerRangeFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIIppIntegerRangeFactory(): IIppIntegerRangeFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Printers.IppIntegerRange".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IIppIntegerRangeFactory.ABI.makeIIppIntegerRangeFactory(factoryActivatorPtr.value))
    }

    public fun activate(start: Int, end: Int): JNAPointer? =
        IIppIntegerRangeFactory_Instance.CreateInstance(start, end)?.pointer

    public override fun fromNative(segment: MemoryAddress): IppIntegerRange {
      val address = segment.toRawLongValue()
      return IppIntegerRange(Pointer(address))
    }

    public override fun toNative(obj: IppIntegerRange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
