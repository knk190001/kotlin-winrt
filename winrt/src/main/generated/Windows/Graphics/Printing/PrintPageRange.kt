package Windows.Graphics.Printing

import Windows.Graphics.Printing.IPrintPageRangeFactory.ABI.IID
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

@ABIMarker(PrintPageRange.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintPageRange;{f8a06c54-6e7c-51c5-57fd-0660c2d71513})")
@WinRTByReference(brClass = PrintPageRange.ByReference::class)
public class PrintPageRange(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintPageRange.WithDefault, IWinRTObject {
  private val __461459075_Interface: IPrintPageRange.WithDefault by lazy {
    as_461459075()
  }


  public override val __461459075_Ptr: JNAPointer? by lazy {
    __461459075_Interface.__461459075_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__461459075_Interface)

  public constructor(firstPage: Int, lastPage: Int) : this(ABI.activate(firstPage, lastPage))

  public constructor(page: Int) : this(ABI.activate(page))

  private fun as_461459075(): IPrintPageRange.WithDefault {
    if(pointer == NULL) {
      return(IPrintPageRange.ABI.makeIPrintPageRange(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintPageRange>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintPageRange.ABI.makeIPrintPageRange(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PrintPageRange>
      {
    public override fun getValue() = PrintPageRange(pointer.getPointer(0))

    public fun setValue(value: PrintPageRange): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintPageRange, MemoryAddress> {
    public val IPrintPageRangeFactory_Instance: IPrintPageRangeFactory by lazy {
      createIPrintPageRangeFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPrintPageRangeFactory(): IPrintPageRangeFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing.PrintPageRange".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPrintPageRangeFactory.ABI.makeIPrintPageRangeFactory(factoryActivatorPtr.value))
    }

    public fun activate(firstPage: Int, lastPage: Int): JNAPointer? =
        IPrintPageRangeFactory_Instance.Create(firstPage, lastPage)?.pointer

    public fun activate(page: Int): JNAPointer? =
        IPrintPageRangeFactory_Instance.CreateWithSinglePage(page)?.pointer

    public override fun fromNative(segment: MemoryAddress): PrintPageRange {
      val address = segment.toRawLongValue()
      return PrintPageRange(Pointer(address))
    }

    public override fun toNative(obj: PrintPageRange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
